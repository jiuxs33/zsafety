package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rel_adma_file")
public class RelAdmaFile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="org_cd",length=9)
	private String orgCd;
	
	@Column(name="file_cd",length=32,nullable=false)
	private String fileCd;
	@Column(name="ts",nullable=false)
	private Date ts;
	@Column(name="nt",length=256)
	private String nt;
	
	
	public String getOrgCd() {
		return orgCd;
	}

	public void setOrgCd(String orgCd) {
		this.orgCd = orgCd;
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

	public RelAdmaFile() {
		
	}

}
