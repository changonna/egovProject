package egovframework.com.sym.tbm.tbp.service;

import java.util.Collections;
import java.util.List;

/**
 * 개요
 * - 장애처리결과정보에 대한 Vo 클래스를 정의한다.
 *
 * 상세내용
 * - 장애정보의 목록 항목, 조회조건, 삭제대상을 관리한다.
 * @author 이문준
 * @version 1.0
 * @created 28-6-2010 오전 10:44:58
 */
public class TroblProcessVO extends TroblProcess {

	private static final long serialVersionUID = 1L;
	/**
	 * 장애정보 목록
	 */
	private List<?> troblProcessList;
	/**
	 * 장애명 조회조건
	 */
	private String strTroblNm;
	/**
	 * 장애종류 조회조건
	 */
	private String strTroblKnd;
	/**
	 * 처리상태 조회조건
	 */
	private String strProcessSttus;
	/**
	 * 삭제대상 목록
	 */
	private String delYn[];
	/**
	 * @return the troblProcessList
	 */
	public List<?> getTroblProcessList() {
		return troblProcessList;
	}
	/**
	 * @param troblProcessList the troblProcessList to set
	 */
	public void setTroblProcessList(List<?> troblProcessList) {
		this.troblProcessList = Collections.unmodifiableList(troblProcessList);
	}
	/**
	 * @return the strTroblNm
	 */
	public String getStrTroblNm() {
		return strTroblNm;
	}
	/**
	 * @param strTroblNm the strTroblNm to set
	 */
	public void setStrTroblNm(String strTroblNm) {
		this.strTroblNm = strTroblNm;
	}
	/**
	 * @return the strTroblKnd
	 */
	public String getStrTroblKnd() {
		return strTroblKnd;
	}
	/**
	 * @param strTroblKnd the strTroblKnd to set
	 */
	public void setStrTroblKnd(String strTroblKnd) {
		this.strTroblKnd = strTroblKnd;
	}
	/**
	 * @return the strProcessSttus
	 */
	public String getStrProcessSttus() {
		return strProcessSttus;
	}
	/**
	 * @param strProcessSttus the strProcessSttus to set
	 */
	public void setStrProcessSttus(String strProcessSttus) {
		this.strProcessSttus = strProcessSttus;
	}
	/**
	 * @return the delYn
	 */
	public String[] getDelYn() {
		String[] ret = null;

		if (delYn != null) {
			ret = new String[delYn.length];

			for (int i = 0; i < delYn.length; i++) {
				ret[i] = delYn[i];
			}
		}
		return ret;
	}
	/**
	 * @param delYn the delYn to set
	 */
	public void setDelYn(String[] delYn) {
		this.delYn = new String[delYn.length];

		for (int i = 0; i <  delYn.length; ++i) {
			this.delYn[i] = delYn[i];
		}
	}

}