package com.example.bookbransaction.entity;

/**
 * 图书分类表
 *
 * @author Michael Chow
 * @date   2019/11/11
 */
public class BookType {
    /**
     * 图书类别id
     */
    private Integer typeId;

    /**
     * 图书类别名称
     */
    private String typeName;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}