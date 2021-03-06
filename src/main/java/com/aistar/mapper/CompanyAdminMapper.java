package com.aistar.mapper;

import com.aistar.pojo.CompanyAdmin;
import com.aistar.pojo.CompanyAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    int countByExample(CompanyAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    int deleteByExample(CompanyAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    int deleteByPrimaryKey(Integer companyAdminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    int insert(CompanyAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    int insertSelective(CompanyAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    List<CompanyAdmin> selectByExample(CompanyAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    CompanyAdmin selectByPrimaryKey(Integer companyAdminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") CompanyAdmin record, @Param("example") CompanyAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    int updateByExample(@Param("record") CompanyAdmin record, @Param("example") CompanyAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    int updateByPrimaryKeySelective(CompanyAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
    int updateByPrimaryKey(CompanyAdmin record);
}