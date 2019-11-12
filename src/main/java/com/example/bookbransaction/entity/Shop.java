package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 商店
 *
 * @author Michael Chow
 * @date   2019/11/11
 */
public class Shop {
    /**
     * 商店id
     */
    private Integer shopId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 商店名称
     */
    private String shopName;

    /**
     * 航电地址
     */
    private String shopAddress;

    /**
     * 营业执照图片地址
     */
    private String businessLicenseImage;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修该时间
     */
    private Date updateTime;

    /**
     * 状态
     */
    private Integer status;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getBusinessLicenseImage() {
        return businessLicenseImage;
    }

    public void setBusinessLicenseImage(String businessLicenseImage) {
        this.businessLicenseImage = businessLicenseImage;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}