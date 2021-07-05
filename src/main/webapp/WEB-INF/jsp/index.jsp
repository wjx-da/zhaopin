<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>校园招聘网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
</head>
<body>
<jsp:include page="navigate/navigate.jsp"/>
<div id="container">
    <%--搜索框--%>
    <div id="search_div">
        <div id="search_input">
            <input type="text" placeholder="搜索职位/公司" id="searchContent">
            <button id="searchBtn" type="button">搜索</button>
        </div>
    </div>
    <%--职位列表--%>
    <div id="index_vocationList">
        <img id="listImg" src="${pageContext.request.contextPath}/images/jkf_imgs/sgu.jpg" alt="">
        <ul id="index_showList">
            <li class="listrow">
                <div>
                    <strong>技术</strong>
                    <a href="">Java</a>
                    <a href="">PHP</a>
                    <a href="">web前端</a>
                    <a href="">算法工程师</a>
                    <a href="" class="a_img">
                        <img src="${pageContext.request.contextPath}/images/jkf_imgs/goRigth.svg" alt="">
                    </a>
                </div>
                <ul class="index_hideList">
                    <li>
                        <h4>技术</h4>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                    <li>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                    <li>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                    <li>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                    <li>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                </ul>
            </li>
            <li class="listrow">
                <div>
                    <strong>产品</strong>
                    <a href="">产品经理</a>
                    <a href="">产品总监</a>
                    <a href="">数据产品经理</a>
                    <a href="" class="a_img">
                        <img src="${pageContext.request.contextPath}/images/jkf_imgs/goRigth.svg" alt="">
                    </a>
                </div>
                <ul class="index_hideList">
                    <li>
                        <h4>产品</h4>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                </ul>
            </li>
            <li class="listrow">
                <div>
                    <strong>设计</strong>
                    <a href="">UI设计师</a>
                    <a href="">平面设计师</a>
                    <a href="">交互设计师</a>
                    <a href="" class="a_img">
                        <img src="${pageContext.request.contextPath}/images/jkf_imgs/goRigth.svg" alt="">
                    </a>
                </div>
                <ul class="index_hideList">
                    <li>
                        <h4>设计</h4>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                </ul>
            </li>
            <li class="listrow">
                <div>
                    <strong>运营</strong>
                    <a href="">新媒体运营</a>
                    <a href="">产品运营</a>
                    <a href="">网络推广</a>
                    <a href="" id="a_imgY">
                        <img src="${pageContext.request.contextPath}/images/jkf_imgs/goRigth.svg" alt="">
                    </a>
                </div>
                <ul class="index_hideList">
                    <li>
                        <h4>运营</h4>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                </ul>
            </li>
            <li class="listrow">
                <div>
                    <strong>市场</strong>
                    <a href="">市场营销</a>
                    <a href="">市场推广</a>
                    <a href="">品牌公关</a>
                    <a href="">策划经理</a>
                    <a href="" id="a_imgS">
                        <img src="${pageContext.request.contextPath}/images/jkf_imgs/goRigth.svg" alt="">
                    </a>
                </div>
                <ul class="index_hideList">
                    <li>
                        <h4>市场</h4>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                </ul>
            </li>
            <li class="listrow">
                <div>
                    <strong>人事</strong>
                    <a href="">人事/HR</a>
                    <a href="">行政</a>
                    <a href="">财务</a>
                    <a href="">培训</a>
                    <a href="">绩效考核</a>
                    <a href="" id="a_imgR">
                        <img src="${pageContext.request.contextPath}/images/jkf_imgs/goRigth.svg" alt="">
                    </a>
                </div>
                <ul class="index_hideList">
                    <li>
                        <h4>人事</h4>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                </ul>
            </li>
            <li class="listrow">
                <div>
                    <strong>高级管理</strong>
                    <a href="">CEO/总裁/总经理</a>
                    <a href="">事业部负责热人</a>
                    <a href="" id="a_imgG">
                        <img src="${pageContext.request.contextPath}/images/jkf_imgs/goRigth.svg" alt="">
                    </a>
                </div>
                <ul class="index_hideList">
                    <li>
                        <h4>高级管理</h4>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                    <li>
                        <div class="text">
                            <a href="">后端开发</a>
                            <a href="">Java</a>
                            <a href="">C++</a>
                            <a href="">PHP</a>
                            <a href="">数据挖掘</a>
                        </div>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
    <div id="Position_list">
        <!--职位信息-->
        <div id="Specific_info">
            <ul id="jobUL" class="js_content"></ul>
            <a href="${pageContext.request.contextPath}/job/jobInfo" class="btn">查看更多</a>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/dist/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/index.js"></script>
</body>
</html>