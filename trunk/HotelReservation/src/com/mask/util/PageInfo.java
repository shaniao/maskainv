package com.mask.util;


import java.io.Serializable;
import java.util.List;

public class PageInfo implements Serializable {

	private static final long serialVersionUID = 1365747893051987016L;

	private int pageSize = 10; // 数据集最大显示数目
	private int recordCount; // 数据集总数
	private int pageCount; // 总页码数
	private int pageId = 1; // 当前页码数
	private int prePageIndex; // 上一页序号
	private int nextPageIndex; // 下一页序号
	private int startIndex; // 页面数据集在总数据中的开始序号
	private int endIndex; // 页面数据集在总数据中的结尾序号
	@SuppressWarnings("unchecked")
	private List items; // 页面数据集具体新型
	private boolean firstPage; // 是否第一页
	private boolean lastPage; // 是否最后一页

	public PageInfo() {

	}

	public PageInfo(int curentIndex, int recordCount) {
		this.setRecordCount(recordCount);
		this.setPageId(curentIndex);
	}
	/**
	 * 获取最大显示数目
	 * @return
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * 设置最大显示数目
	 * @return
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 获取数据集总数
	 * @return
	 */
	public int getRecordCount() {
		return recordCount;
	}
	/**
	 * 设置数据集总数
	 * @return
	 */
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
		// 通过总记录数算得总页数
		if (recordCount % pageSize == 0) {
			pageCount = recordCount / pageSize;
		} else {
			pageCount = recordCount / pageSize + 1;
		}
	}
	/**
	 * 获取总页码数
	 * @return
	 */
	public int getPageCount() {
		return pageCount;
	}
	/**
	 * 设置总页码数
	 * @return
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	/**
	 * 获取当前页码数
	 * @return
	 */
	public int getPageId() {
		return pageId;
	}
	/**
	 * 设置当前页码数
	 * @return
	 */
	public void setPageId(int pageId) {
		this.pageId = pageId;
		// 上一页，下一页确定
		prePageIndex = pageId - 1;
		nextPageIndex = pageId + 1;
		// 是否第一页，最后一页
		if (pageId == 1) {
			firstPage = true;
		} else {
			firstPage = false;
		}
		if (pageId == pageCount) {
			lastPage = true;
		} else {
			lastPage = false;
		}
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	@SuppressWarnings("unchecked")
	public List getItems() {
		return items;
	}

	@SuppressWarnings("unchecked")
	public void setItems(List items) {
		this.items = items;
	}

	public boolean isFirstPage() {
		return firstPage;
	}

	public void setFirstPage(boolean firstPage) {
		this.firstPage = firstPage;
	}

	public boolean isLastPage() {
		return lastPage;
	}

	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}

	public int getPrePageIndex() {
		return prePageIndex;
	}

	public void setPrePageIndex(int prePageIndex) {
		this.prePageIndex = prePageIndex;
	}

	public int getNextPageIndex() {
		return nextPageIndex;
	}

	public void setNextPageIndex(int nextPageIndex) {
		this.nextPageIndex = nextPageIndex;
	}
}
