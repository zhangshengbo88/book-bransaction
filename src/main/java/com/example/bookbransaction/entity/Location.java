package com.example.bookbransaction.entity;

/**
 * 国家及地区信息
 *
 * @author Michael Chow
 * @date   2019/11/10
 */
public class Location {
    /**
     * 区域id
     */
    private Integer id;

    /**
     * 简拼
     */
    private String simplified;

    /**
     * 全拼
     */
    private String spelling;

    /**
     * 英文简拼
     */
    private String englishSimplified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSimplified() {
        return simplified;
    }

    public void setSimplified(String simplified) {
        this.simplified = simplified;
    }

    public String getSpelling() {
        return spelling;
    }

    public void setSpelling(String spelling) {
        this.spelling = spelling;
    }

    public String getEnglishSimplified() {
        return englishSimplified;
    }

    public void setEnglishSimplified(String englishSimplified) {
        this.englishSimplified = englishSimplified;
    }
}