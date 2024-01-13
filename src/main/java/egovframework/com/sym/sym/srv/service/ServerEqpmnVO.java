package egovframework.com.sym.sym.srv.service;

import java.util.Collections;
import java.util.List;

/**
 * 개요
 * - 서버장비에 대한 Vo 클래스를 정의한다.
 *
 * 상세내용
 * - 서버장비의 목록 항목 및 조회조건을 관리한다.
 * @author 이문준
 * @version 1.0
 * @created 28-6-2010 오전 10:44:55
 * 
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *  수정일               수정자            수정내용
 *  ----------   --------   ---------------------------
 *  2020-08-28   신용호            보안약점 조치 (Private 배열에 Public 데이터 할당[CWE-496])
 *
 * </pre>
 * 
 */
public class ServerEqpmnVO extends ServerEqpmn {

	private static final long serialVersionUID = 1L;
	/**
	 * 서버 장비 목록
	 */
	private List<?> serverEqpmnList;
	/**
	 * 삭제대상 목록
	 */
	String delYn[];
	/**
	 * 서버장비명 조회조건
	 */
	private String strServerEqpmnNm;

	/**
	 * @return the serverEqpmnList
	 */
	public List<?> getServerEqpmnList() {
		return serverEqpmnList;
	}
	/**
	 * @param serverEqpmnList the serverEqpmnList to set
	 */
	public void setServerEqpmnList(List<?> serverEqpmnList) {
		this.serverEqpmnList = Collections.unmodifiableList(serverEqpmnList);
	}
	/**
	 * @return the delYn
	 */
	public String[] getDelYn() {
		return delYn;
	}
	/**
	 * @param delYn the delYn to set
	 */
	public void setDelYn(String[] delYn) {
		this.delYn = delYn.clone();
	}
	/**
	 * @return the strServerEqpmnNm
	 */
	public String getStrServerEqpmnNm() {
		return strServerEqpmnNm;
	}
	/**
	 * @param strServerEqpmnNm the strServerEqpmnNm to set
	 */
	public void setStrServerEqpmnNm(String strServerEqpmnNm) {
		this.strServerEqpmnNm = strServerEqpmnNm;
	}
}