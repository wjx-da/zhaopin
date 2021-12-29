package com.aistar.controller;

import com.aistar.pojo.Customer;
import com.aistar.service.CustomerService;
import com.aistar.service.ResumeDeliveryRecordService;
import com.aistar.service.ResumeService;
import com.aistar.serviceVO.ResumeJobCompanyRDRVOService;
import com.aistar.util.RandomValidateCode;
import com.aistar.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;
    private ResumeService resumeService;
    private ResumeJobCompanyRDRVOService resumeJobCompanyRDRVOService;

    @Autowired
    public CustomerController(ResumeJobCompanyRDRVOService resumeJobCompanyRDRVOService, CustomerService customerService, ResumeService resumeService) {
        this.resumeJobCompanyRDRVOService = resumeJobCompanyRDRVOService;
        this.customerService = customerService;
        this.resumeService = resumeService;
    }

    //    个人中心跳转
    @GetMapping("/center/{type}")
    public String center(@PathVariable("type") Integer type, HttpServletRequest request) {
        Customer customer = (Customer) request.getSession().getAttribute("loginCustomer");
        ServerResponse serverResponse;
        if (customer != null) {
            if (type == 1) {
                serverResponse = resumeService.getByCustomerId(customer.getCustId());
                request.setAttribute("resumeList", serverResponse.getData());
            } else if (type == 2) {
                serverResponse = resumeJobCompanyRDRVOService.getByCustomerId(customer.getCustId());//封装了用户简历，工作 公司的对象
                request.setAttribute("rdrList", serverResponse.getData());
            }
            request.setAttribute("type", type);//这里的type需要判断
            return "customer/personalCenter";
        } else {
            return "redirect:/"; // 未登录
        }
    }
    @RequestMapping(value = "/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
        response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandcode(request, response);//输出验证码图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //    登录ajax
    @GetMapping("/login")
    @ResponseBody
    public ServerResponse login(String username, String password,String code, Integer type, Integer userType, HttpServletRequest request) {
        ServerResponse serverResponse = null;
        System.out.println(code+" =========");
        if (1 == type) { // 手机号、邮箱 & 密码
            // userType = 0手机号；1邮箱
            serverResponse = customerService.getByUsernameAndPwd(username, password, userType);
            if (serverResponse.getStatus() == 1) { // 登录成功 用户存在
                Customer customer = (Customer) serverResponse.getData();
                request.getSession().setAttribute("loginCustomer", customer);
            }
        } else {
            // 手机号 & 验证码
            System.out.println("手机号，验证码登录");
        }
        return serverResponse;
    }

    //    退出登录跳转
    @RequestMapping("/logout")
    public String register(HttpServletRequest request) {
        request.getSession().removeAttribute("loginCustomer");
        return "redirect:/";
    }

    //    注册ajax
    @PostMapping("/add")
    @ResponseBody
    public ServerResponse register(Customer customer) {
        customer.setCustName(customer.getCustTelno().toString());
        return customerService.add(customer);
    }

    //    获取验证码ajax
    @GetMapping("/getCode")
    @ResponseBody
    public ServerResponse getCheckedCode(Long custTelno) {
        // 数据库中查看手机号是否已经注册
        ServerResponse serverResponse = customerService.getByTelno(custTelno);
        ServerResponse result;
        if (serverResponse.getStatus() != 1) {
            // 失败 - 用户不存在，可以创建
            // 获取验证码 - 调用短信接口
            // String code =  GetMessageCode.getCode(telnoStr);
            String code = "666666";
            result = ServerResponse.getSuccess(code);
        } else {
            // 成功 - 用户已经存在
            result = ServerResponse.getFailed("用户已存在，请前往登录页面");
        }
        return result;
    }

}
