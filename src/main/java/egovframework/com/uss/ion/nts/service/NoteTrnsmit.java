package egovframework.com.uss.ion.nts.service;

import java.io.Serializable;

import egovframework.com.cmm.ComDefaultVO;

/**
 * 보낸쪽지함관리 Model and VO Class 구현
 * @author 공통서비스 장동한
 * @since 2010.06.16
 * @version 1.0
 * @see <pre>
 * &lt;&lt; 개정이력(Modification Information) &gt;&gt;
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.07.03  장동한          최초 생성
 * 
 * </pre>
 */
@SuppressWarnings("serial")
public class NoteTrnsmit extends ComDefaultVO implements Serializable{
	
	/** 쪽지 ID */
	private String noteId;
	
	/** 쪽지 송신 ID */
	private String noteTrnsmitId;
	
	/** 쪽지 수신 ID */
	private String noteRecptnId;
	
	/** 쪽지 송신자 ID */
	private String trnsmiterId;
	
	/** 개봉여부 */
	private String openYn;
	
	/** 쪽지 제목 */
	private String noteSj;
	
	/** 쪽지 내용 */
	private String noteCn;
	
	/** 쪽지 첨부파일 */
	private String atchFileId;
	
	/** 보낸 시작날짜 */
	private String searchFromDate;
	
	/** 보낸 종료날짜 */
	private String searchToDate;
	
    /** 최초등록시점 */
    private String frstRegisterPnttm;

    /** 최초등록아이디 */
    private String frstRegisterId;

    /** 최종수정일 */
    private String lastUpdusrPnttm;

    /** 최종수정자 아이디 */
    private String lastUpdusrId;

	/**
	 * @return the noteId
	 */
	public String getNoteId() {
		return noteId;
	}

	/**
	 * @param noteId the noteId to set
	 */
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	/**
	 * @return the noteTrnsmitId
	 */
	public String getNoteTrnsmitId() {
		return noteTrnsmitId;
	}

	/**
	 * @param noteTrnsmitId the noteTrnsmitId to set
	 */
	public void setNoteTrnsmitId(String noteTrnsmitId) {
		this.noteTrnsmitId = noteTrnsmitId;
	}

	/**
	 * @return the noteRecptnId
	 */
	public String getNoteRecptnId() {
		return noteRecptnId;
	}

	/**
	 * @param noteRecptnId the noteRecptnId to set
	 */
	public void setNoteRecptnId(String noteRecptnId) {
		this.noteRecptnId = noteRecptnId;
	}

	/**
	 * @return the trnsmiterId
	 */
	public String getTrnsmiterId() {
		return trnsmiterId;
	}

	/**
	 * @param trnsmiterId the trnsmiterId to set
	 */
	public void setTrnsmiterId(String trnsmiterId) {
		this.trnsmiterId = trnsmiterId;
	}

	/**
	 * @return the openYn
	 */
	public String getOpenYn() {
		return openYn;
	}

	/**
	 * @param openYn the openYn to set
	 */
	public void setOpenYn(String openYn) {
		this.openYn = openYn;
	}

	/**
	 * @return the noteSj
	 */
	public String getNoteSj() {
		return noteSj;
	}

	/**
	 * @param noteSj the noteSj to set
	 */
	public void setNoteSj(String noteSj) {
		this.noteSj = noteSj;
	}

	/**
	 * @return the noteCn
	 */
	public String getNoteCn() {
		return noteCn;
	}

	/**
	 * @param noteCn the noteCn to set
	 */
	public void setNoteCn(String noteCn) {
		this.noteCn = noteCn;
	}

	/**
	 * @return the atchFileId
	 */
	public String getAtchFileId() {
		return atchFileId;
	}

	/**
	 * @param atchFileId the atchFileId to set
	 */
	public void setAtchFileId(String atchFileId) {
		this.atchFileId = atchFileId;
	}

	/**
	 * @return the searchFromDate
	 */
	public String getSearchFromDate() {
		return searchFromDate;
	}

	/**
	 * @param searchFromDate the searchFromDate to set
	 */
	public void setSearchFromDate(String searchFromDate) {
		this.searchFromDate = searchFromDate;
	}

	/**
	 * @return the searchToDate
	 */
	public String getSearchToDate() {
		return searchToDate;
	}

	/**
	 * @param searchToDate the searchToDate to set
	 */
	public void setSearchToDate(String searchToDate) {
		this.searchToDate = searchToDate;
	}

	/**
	 * @return the frstRegisterPnttm
	 */
	public String getFrstRegisterPnttm() {
		return frstRegisterPnttm;
	}

	/**
	 * @param frstRegisterPnttm the frstRegisterPnttm to set
	 */
	public void setFrstRegisterPnttm(String frstRegisterPnttm) {
		this.frstRegisterPnttm = frstRegisterPnttm;
	}

	/**
	 * @return the frstRegisterId
	 */
	public String getFrstRegisterId() {
		return frstRegisterId;
	}

	/**
	 * @param frstRegisterId the frstRegisterId to set
	 */
	public void setFrstRegisterId(String frstRegisterId) {
		this.frstRegisterId = frstRegisterId;
	}

	/**
	 * @return the lastUpdusrPnttm
	 */
	public String getLastUpdusrPnttm() {
		return lastUpdusrPnttm;
	}

	/**
	 * @param lastUpdusrPnttm the lastUpdusrPnttm to set
	 */
	public void setLastUpdusrPnttm(String lastUpdusrPnttm) {
		this.lastUpdusrPnttm = lastUpdusrPnttm;
	}

	/**
	 * @return the lastUpdusrId
	 */
	public String getLastUpdusrId() {
		return lastUpdusrId;
	}

	/**
	 * @param lastUpdusrId the lastUpdusrId to set
	 */
	public void setLastUpdusrId(String lastUpdusrId) {
		this.lastUpdusrId = lastUpdusrId;
	}


    
	
}
