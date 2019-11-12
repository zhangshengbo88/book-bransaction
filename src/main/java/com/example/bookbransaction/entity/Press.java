package com.example.bookbransaction.entity;

/**
 * 出版社
 *
 * @author Michael Chow
 * @date   2019/11/11
 */
public class Press {
    /**
     * 出版社id
     */
    private Integer pressId;

    /**
     * 出版社名称
     */
    private String pressName;

    public Integer getPressId() {
        return pressId;
    }

    public void setPressId(Integer pressId) {
        this.pressId = pressId;
    }

    public String getPressName() {
        return pressName;
    }

    public void setPressName(String pressName) {
        this.pressName = pressName;
    }
}