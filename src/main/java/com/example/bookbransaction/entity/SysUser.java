package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 后台人员用户表
 *
 * @author Michael Chow
 * @date   2019/11/10
 */
public class SysUser {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 工号
     */
    private String code;

    /**
     * 密码
     */
    private String passWard;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别：0-男、1-女
     */
    private Short sex;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 手机号
     */
    private Integer phone;

    /**
     * 状态：0-注销、1-正常、2-封停
     */
    private Short status;

    /**
     * 类型：0-超级管理员、1-客服、2-管理员
     */
    private Short type;

    /**
     * 最后登陆时间
     */
    private Date lastLoginTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassWard() {
        return passWard;
    }

    public void setPassWard(String passWard) {
        this.passWard = passWard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}