package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 流域机构与水资源分区关系表
 * */
@Entity
@Table(name="rel_org_wrz")
public class RelOrgWrz {

	public RelOrgWrz() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="wrz_cd",length=7)
	private String wrzCd;
	
	@Column(name="org_cd",length=9,nullable=false)
	private String orgCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;

	public String getWrzCd() {
		return wrzCd;
	}

	public void setWrzCd(String wrzCd) {
		this.wrzCd = wrzCd;
	}

	public String getOrgCd() {
		return orgCd;
	}

	public void setOrgCd(String orgCd) {
		this.orgCd = orgCd;
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
