package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 交易明细表
 *
 * @author Michael Chow
 * @date   2019/11/10
 */
public class TransactionDetails {
    /**
     * id
     */
    private Integer id;

    /**
     * 类型：0-转出；1-转入；2-交易支出；3-交易收入
     */
    private Integer type;

    /**
     * 关联订单id
     */
    private Integer orderId;

    /**
     * 金额
     */
    private Double value;

    /**
     * 
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}