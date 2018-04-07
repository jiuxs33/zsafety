package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_twmo_b")
public class WrTwmoB {

	public WrTwmoB() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name="org_cd",length=9)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String orgCd;
	
	@Column(name="set_dt")
	private Date setDt;
	
	@Column(name="sup_org_cd",length=9)
	private String supOrgCd;
	
	@Column(name="maj_bus",length=1024)
	private String majBus;
	
	@Column(name="fund_sour",length=1024)
	private String fundSour;
	
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
	public Date getSetDt() {
		return setDt;
	}
	public void setSetDt(Date setDt) {
		this.setDt = setDt;
	}
	public String getSupOrgCd() {
		return supOrgCd;
	}
	public void setSupOrgCd(String supOrgCd) {
		this.supOrgCd = supOrgCd;
	}
	public String getMajBus() {
		return majBus;
	}
	public void setMajBus(String majBus) {
		this.majBus = majBus;
	}
	public String getFundSour() {
		return fundSour;
	}
	public void setFundSour(String fundSour) {
		this.fundSour = fundSour;
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
