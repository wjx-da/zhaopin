package com.aistar.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_id
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    private Integer custId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_name
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    private String custName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_telno
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    private Long custTelno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_email
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    private String custEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_password
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    private String custPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_regist_time
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date custRegistTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.status
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.other1
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    private String other1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.other2
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    private String other2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_id
     *
     * @return the value of customer.cust_id
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_id
     *
     * @param custId the value for customer.cust_id
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_name
     *
     * @return the value of customer.cust_name
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public String getCustName() {
        return custName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_name
     *
     * @param custName the value for customer.cust_name
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_telno
     *
     * @return the value of customer.cust_telno
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public Long getCustTelno() {
        return custTelno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_telno
     *
     * @param custTelno the value for customer.cust_telno
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public void setCustTelno(Long custTelno) {
        this.custTelno = custTelno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_email
     *
     * @return the value of customer.cust_email
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_email
     *
     * @param custEmail the value for customer.cust_email
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail == null ? null : custEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_password
     *
     * @return the value of customer.cust_password
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public String getCustPassword() {
        return custPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_password
     *
     * @param custPassword the value for customer.cust_password
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword == null ? null : custPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_regist_time
     *
     * @return the value of customer.cust_regist_time
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public Date getCustRegistTime() {
        return custRegistTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_regist_time
     *
     * @param custRegistTime the value for customer.cust_regist_time
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public void setCustRegistTime(Date custRegistTime) {
        this.custRegistTime = custRegistTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.status
     *
     * @return the value of customer.status
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.status
     *
     * @param status the value for customer.status
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.other1
     *
     * @return the value of customer.other1
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.other1
     *
     * @param other1 the value for customer.other1
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.other2
     *
     * @return the value of customer.other2
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.other2
     *
     * @param other2 the value for customer.other2
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custTelno=").append(custTelno);
        sb.append(", custEmail=").append(custEmail);
        sb.append(", custPassword=").append(custPassword);
        sb.append(", custRegistTime=").append(custRegistTime);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}