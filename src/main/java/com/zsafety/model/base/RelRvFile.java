package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rel_rv_file")
public class RelRvFile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rv_cd",length=12)
	private String rvCd;
	
	@Column(name="file_cd",length=32,nullable=false)
	private String fileCd;
	@Column(name="ts",nullable=false)
	private Date ts;
	@Column(name="nt",length=256)
	private String nt;
	
	
	
	public String getRvCd() {
		return rvCd;
	}

	public void setRvCd(String rvCd) {
		this.rvCd = rvCd;
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

	public RelRvFile() {
		
	}

}
