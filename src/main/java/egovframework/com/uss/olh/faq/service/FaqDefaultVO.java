package egovframework.com.uss.olh.faq.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * FAQ를 처리하는 DefaultVO 클래스
 * @author 공통서비스 개발팀 박정규
 * @since 2009.04.01
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.04.01  박정규          최초 생성
 *
 * </pre>
 */
public class FaqDefaultVO implements Serializable {

	private static final long serialVersionUID = -7135776861537710232L;

	/** 검색조건 */
	private String searchCnd = "";

	/** 검색Keyword */
	private String searchWrd = "";

	/** 검색사용여부 */
	private String searchUseYn = "";

	/** 현재페이지 */
	private int pageIndex = 1;

	/** 페이지개수 */
	private int pageUnit = 10;

	/** 페이지사이즈 */
	private int pageSize = 10;

	/** firstIndex */
	private int firstIndex = 1;

	/** lastIndex */
	private int lastIndex = 1;

	/** recordCountPerPage */
	private int recordCountPerPage = 10;

	/**
	 * searchCnd attribute 를 리턴한다.
	 * @return the String
	 */
	public String getSearchCnd() {
		return searchCnd;
	}

	/**
	 * searchCnd attribute 값을 설정한다.
	 * @return searchCnd String
	 */
	public void setSearchCnd(String searchCnd) {
		this.searchCnd = searchCnd;
	}

	/**
	 * searchWrd attribute 를 리턴한다.
	 * @return the String
	 */
	public String getSearchWrd() {
		return searchWrd;
	}

	/**
	 * searchWrd attribute 값을 설정한다.
	 * @return searchWrd String
	 */
	public void setSearchWrd(String searchWrd) {
		this.searchWrd = searchWrd;
	}

	/**
	 * searchUseYn attribute 를 리턴한다.
	 * @return the String
	 */
	public String getSearchUseYn() {
		return searchUseYn;
	}

	/**
	 * searchUseYn attribute 값을 설정한다.
	 * @return searchUseYn String
	 */
	public void setSearchUseYn(String searchUseYn) {
		this.searchUseYn = searchUseYn;
	}

	/**
	 * pageIndex attribute 를 리턴한다.
	 * @return the int
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * pageIndex attribute 값을 설정한다.
	 * @return pageIndex int
	 */
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	/**
	 * pageUnit attribute 를 리턴한다.
	 * @return the int
	 */
	public int getPageUnit() {
		return pageUnit;
	}

	/**
	 * pageUnit attribute 값을 설정한다.
	 * @return pageUnit int
	 */
	public void setPageUnit(int pageUnit) {
		this.pageUnit = pageUnit;
	}

	/**
	 * pageSize attribute 를 리턴한다.
	 * @return the int
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * pageSize attribute 값을 설정한다.
	 * @return pageSize int
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * firstIndex attribute 를 리턴한다.
	 * @return the int
	 */
	public int getFirstIndex() {
		return firstIndex;
	}

	/**
	 * firstIndex attribute 값을 설정한다.
	 * @return firstIndex int
	 */
	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}

	/**
	 * lastIndex attribute 를 리턴한다.
	 * @return the int
	 */
	public int getLastIndex() {
		return lastIndex;
	}

	/**
	 * lastIndex attribute 값을 설정한다.
	 * @return lastIndex int
	 */
	public void setLastIndex(int lastIndex) {
		this.lastIndex = lastIndex;
	}

	/**
	 * recordCountPerPage attribute 를 리턴한다.
	 * @return the int
	 */
	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}

	/**
	 * recordCountPerPage attribute 값을 설정한다.
	 * @return recordCountPerPage int
	 */
	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}
	
	/**
	 * toString 메소드를 대치한다.
	 */
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}

}
