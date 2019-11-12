package com.example.bookbransaction.utils;

import com.example.bookbransaction.model.base.Page;
import com.github.pagehelper.PageInfo;

public class BaseUtil {
	/**
	 * org.springframework.data.domain.Page响应分页条数转换
	 * @param pages
	 * @return
	 */
	public static Page buildPage(org.springframework.data.domain.Page<?> pages) {
		Page page = new Page();
		page.setPageNum(pages.getNumber()+1);
		page.setPages(page.getPages());
		page.setTotal(pages.getTotalElements());
		page.setPageSize(pages.getSize());
		return page;
		
	}

	/**
	 * com.github.pagehelper.Page响应分页条数转换
	 * @param pages
	 * @return
	 */
	public static Page buildPage(com.github.pagehelper.Page<?> pages) {
		Page page = new Page();
		page.setPageNum(pages.getPageNum());
		page.setPages(page.getPages());
		page.setTotal(pages.getTotal());
		page.setPageSize(pages.getPageSize());
		return page;

	}

	/**
	 *  com.github.pagehelper.PageInfo 响应分页条数转换
	 * @param pages
	 * @return
	 */
	public static Page buildPage(PageInfo<?> pages) {
		Page page = new Page();
		page.setPageNum(pages.getPageNum()+1);
		page.setPages(page.getPages());
		page.setTotal(pages.getTotal());
		page.setPageSize(pages.getPageSize());
		return page;
	}
}
