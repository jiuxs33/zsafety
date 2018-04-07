package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 渠道工程与多媒体资料关系表
 * */
@Entity
@Table(name="rel_chan_file")
public class RelChanFile {

	public RelChanFile() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="chan_cd",length=12,nullable=false)
	private String chanCd;
	
	@Column(name="file_cd",length=32)
	private String fileCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	
	public String getChanCd() {
		return chanCd;
	}
	public void setChanCd(String chanCd) {
		this.chanCd = chanCd;
	}
	public String getFileCd() {
		return fileCd;
	}
	public void setFileCd(String fileCd) {
		this.fileCd = fileCd;
	}
	public Date getTs() {
		return ts;
	}
	public void setTs(Date ts) {
		this.ts = ts;
	}
	public String getNt() {
		return nt;
	}
	public void setNt(String nt) {
		this.nt = nt;
	}
}
