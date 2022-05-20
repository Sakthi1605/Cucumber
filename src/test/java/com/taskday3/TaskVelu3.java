package com.taskday3;

import java.awt.List;
import java.util.ArrayList;

import com.pojo.Support;

public class TaskVelu3 {

	
	private Integer page;
	    private Integer perPage;
	    private Integer total;
	    private Integer totalPages;
	    private ArrayList<Datum> data = new ArrayList<Datum>();
	    private SupportDay3 support;
		public TaskVelu3(Integer page, Integer perPage, Integer total, Integer totalPages, ArrayList<Datum> data,
				SupportDay3 support) {
			super();
			this.page = page;
			this.perPage = perPage;
			this.total = total;
			this.totalPages = totalPages;
			this.data = data;
			this.support = support;
		}
		public Integer getPage() {
			return page;
		}
		public void setPage(Integer page) {
			this.page = page;
		}
		public Integer getPerPage() {
			return perPage;
		}
		public void setPerPage(Integer perPage) {
			this.perPage = perPage;
		}
		public Integer getTotal() {
			return total;
		}
		public void setTotal(Integer total) {
			this.total = total;
		}
		public Integer getTotalPages() {
			return totalPages;
		}
		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}
		public ArrayList<Datum> getData() {
			return data;
		}
		public void setData(ArrayList<Datum> data) {
			this.data = data;
		}
		public SupportDay3 getSupport() {
			return support;
		}
		public void setSupport(SupportDay3 support) {
			this.support = support;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
