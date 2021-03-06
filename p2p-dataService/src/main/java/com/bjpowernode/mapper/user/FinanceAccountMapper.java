package com.bjpowernode.mapper.user;

import com.bjpowernode.model.FinanceAccount;

import java.util.HashMap;

public interface FinanceAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    int insert(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    int insertSelective(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    FinanceAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    int updateByPrimaryKey(FinanceAccount record);

    FinanceAccount selecFinanceAccountByUid(Integer userId);

    Integer updateFinanceAfterIncome(HashMap<String, Object> paramMap);

    Integer updateFinaceAccountByUid(FinanceAccount financeAccount);
}