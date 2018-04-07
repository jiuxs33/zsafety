package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 灌区与多媒体资料关系表
 * */
@Entity
@Table(name="rel_irr_file")
public class RelIrrFile {

	public RelIrrFile() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="irr_cd",length=12,nullable=false)
	private String irrCd;
	
	@Column(name="file_cd",length=32)
	private String fileCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	public String getIrrCd() {
		return irrCd;
	}
	public void setIrrCd(String irrCd) {
		this.irrCd = irrCd;
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
