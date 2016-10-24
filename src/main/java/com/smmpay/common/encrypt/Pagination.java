package com.smmpay.common.encrypt;

import java.util.List;

public class Pagination<T> {

	//当前�?
	private Integer pageNo;
	//每次显示条数
	private Integer pageSize;
	//总页�?
	private Integer pageCount;
	//总记录数
	private Integer totalCount;
	//记录对象
	private List<T> listContent;
	
	public Pagination(){}
	public Pagination(Integer pageSize){
		this.pageSize = pageSize;
	}
	
	public Pagination(Integer pageNo,Integer pageSize,Integer pageCount,Integer totalCount,List<T> listContent){
		this.pageSize = pageSize;
		this.pageNo = pageNo;
		this.pageCount = pageCount;
		this.totalCount = totalCount;
		this.listContent = listContent;
	}
	
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageCount() {
		return totalCount % pageSize > 0?(totalCount / pageSize + 1):totalCount / pageSize;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public List<T> getListContent() {
		return listContent;
	}
	public void setListContent(List<T> listContent) {
		this.listContent = listContent;
	}
	
	
}
