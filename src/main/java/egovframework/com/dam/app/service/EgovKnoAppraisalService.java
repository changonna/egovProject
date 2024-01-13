package egovframework.com.dam.app.service;

import java.util.List;

/**
 * 개요
 * - 지식정보평가에 대한 Service Interface를 정의한다.
 *
 * 상세내용
 * - 지식정보평가에 대한 등록, 수정, 삭제, 조회 기능을 제공한다.
 * - 지식정보평가의 조회기능은 목록조회, 상세조회로 구분된다.
 * @author 박종선
 * @version 1.0
 * @created 12-8-2010 오후 3:44:37
 */

public interface EgovKnoAppraisalService {

	/**
	 * 등록된 지식정보평가 정보를 조회 한다.
	 * @param KnoAppraisalVO - 지식정보평가 VO
	 * @return String - 지식정보평가 VO
	 *
	 * @param KnoAppraisalVO
	 */
	List<?> selectKnoAppraisalList(KnoAppraisalVO searchVO) throws Exception;

	/**
	 * 지식정보평가 목록 총 개수를 조회한다.
	 * @param MapTeamVO - 지식정보평가 Vo
	 * @return int - 지식정보평가 토탈 카운트 수
	 *
	 * @param KnoAppraisalVO
	 */
	int selectKnoAppraisalTotCnt(KnoAppraisalVO searchVO) throws Exception;

	/**
	 * 지식정보평가 상세 정보를 조회 한다.
	 * @param KnoAppraisalVO - 지식정보평가 VO
	 * @return String - 지식정보평가 VO
	 *
	 * @param KnoAppraisalVO
	 */
	KnoAppraisal selectKnoAppraisal(KnoAppraisal knoAppraisal) throws Exception;

	/**
	 * 지식정보평가 정보를 신규로 등록한다.
	 * @param knoAps - 지식정보평가 model
	 *
	 * @param knoAps
	 */
	void insertKnoAppraisal(KnoAppraisal knoAppraisal) throws Exception;

	/**
	 * 기 등록 된 지식정보평가 정보를 수정 한다.
	 * @param AppraisalknoAps - 지식정보평가 model
	 *
	 * @param knoAps
	 */
	void updateKnoAppraisal(KnoAppraisal knoAppraisal) throws Exception;

	/**
	 * 기 등록된 지식정보평가 정보를 삭제한다.
	 * @param AppraisalknoAps - 지식정보평가 model
	 *
	 * @param knoAps
	 */
	void deleteKnoAppraisal(KnoAppraisal knoAppraisal) throws Exception;

}