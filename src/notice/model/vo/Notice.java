package notice.model.vo;

import java.sql.Date;
import java.util.ArrayList;

public class Notice implements java.io.Serializable {
	private static final long serialVersionUID = 2222L;

	private int noticeNo;
	private String adNo;
	private String noticeTitle;
	private String noticeWriter;
	private java.sql.Date noticeDate;
	private String noticeContent;
	private String originalFile;
	private String renameFile;
	private int noticeReadCount;

	public Notice() {
	}

	public Notice(int noticeNo, String adNo, String noticeTitle, String noticeWriter, Date noticeDate,
			String noticeContent, String originalFile, String renameFile, int noticeReadCount) {
		super();
		this.noticeNo = noticeNo;
		this.adNo = adNo;
		this.noticeTitle = noticeTitle;
		this.noticeWriter = noticeWriter;
		this.noticeDate = noticeDate;
		this.noticeContent = noticeContent;
		this.originalFile = originalFile;
		this.renameFile = renameFile;
		this.noticeReadCount = noticeReadCount;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getAdNo() {
		return adNo;
	}

	public void setAdNo(String adNo) {
		this.adNo = adNo;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeWriter() {
		return noticeWriter;
	}

	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}

	public java.sql.Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(java.sql.Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getOriginalFile() {
		return originalFile;
	}

	public void setOriginalFile(String originalFile) {
		this.originalFile = originalFile;
	}

	public String getRenameFile() {
		return renameFile;
	}

	public void setRenameFile(String renameFile) {
		this.renameFile = renameFile;
	}

	public int getNoticeReadCount() {
		return noticeReadCount;
	}

	public void setNoticeReadCount(int noticeReadCount) {
		this.noticeReadCount = noticeReadCount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", adNo=" + adNo + ", noticeTitle=" + noticeTitle + ", noticeWriter="
				+ noticeWriter + ", noticeDate=" + noticeDate + ", noticeContent=" + noticeContent + ", originalFile="
				+ originalFile + ", renameFile=" + renameFile + ", noticeReadCount=" + noticeReadCount + "]";
	}

	

}
