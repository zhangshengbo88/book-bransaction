package com.example.bookbransaction.model.base;
public class Page {
		private int pageNum;//第几页
	    private int pageSize;//每页多少条
	    private long total;//共多少条
	    private int pages;//共几页
		public int getPageNum() {
			return pageNum;
		}
		public void setPageNum(int pageNum) {
			this.pageNum = pageNum;
		}
		public int getPageSize() {
			return pageSize;
		}
		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}
		public long getTotal() {
			return total;
		}
		public void setTotal(long total) {
			this.total = total;
		}
		public int getPages() {
			return pages;
		}
		public void setPages(int pages) {
			this.pages = pages;
		}
	}