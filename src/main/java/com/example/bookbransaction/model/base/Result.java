package com.example.bookbransaction.model.base;


import org.springframework.util.StringUtils;

public class Result {
	private String code;
	private String desc;
	private Object data;
	private Page page;
	private String token;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public static Result success() {
    	return success(null);
    }
    public static Result success(Object t) {
    	Result result = new Result();
    	result.data = t;
    	result.code = "200";
    	result.desc = "操作成功";
    	return result;
    }
    public static Result fail() {
    	return fail(null);
    }
    public static Result fail(String message) {
    	Result result = new Result();
    	result.code = "400";
    	result.desc = StringUtils.isEmpty(message)? "操作失败": message;
    	return result;
    }
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
