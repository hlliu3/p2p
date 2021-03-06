package com.bjpowernode.model;

import java.io.Serializable;

public class FinanceAccount implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column u_finance_account.id
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column u_finance_account.uid
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column u_finance_account.available_money
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    private Double availableMoney;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column u_finance_account.id
     *
     * @return the value of u_finance_account.id
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column u_finance_account.id
     *
     * @param id the value for u_finance_account.id
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column u_finance_account.uid
     *
     * @return the value of u_finance_account.uid
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column u_finance_account.uid
     *
     * @param uid the value for u_finance_account.uid
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column u_finance_account.available_money
     *
     * @return the value of u_finance_account.available_money
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    public Double getAvailableMoney() {
        return availableMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column u_finance_account.available_money
     *
     * @param availableMoney the value for u_finance_account.available_money
     *
     * @mbg.generated Tue Jun 11 20:18:04 GMT+08:00 2019
     */
    public void setAvailableMoney(Double availableMoney) {
        this.availableMoney = availableMoney;
    }
}