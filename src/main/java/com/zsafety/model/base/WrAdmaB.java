package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_adma_b")
public class WrAdmaB {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="org_cd",length=9)
	private String orgCd;
	@Column(name="org_nm",length=100,nullable=false)
	private String orgNm;
	@Column(name="adl_cd",length=6,nullable=false)
	private String adlCd;
	@Column(name="org_shnm",length=40)
	private String orgShnm;
	@Column(name="org_tp",length=1)
	private String orgTp;
	@Column(name="lr_nm",length=30)
	private String lrNm;
	@Column(name="org_scal",length=1)
	private String orgScal;
	@Column(name="menb",length=1)
	private String menb;
	@Column(name="web",length=100)
	private String web;
	@Column(name="email",length=100)
	private String email;
	@Column(name="addr",length=100)
	private String addr;
	@Column(name="zip",length=6)
	private String zip;
	@Column(name="tel",length=22)
	private String tel;
	@Column(name="fax",length=22)
	private String fax;
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


	public String getOrgNm() {
		return orgNm;
	}


	public void setOrgNm(String orgNm) {
		this.orgNm = orgNm;
	}


	public String getAdlCd() {
		return adlCd;
	}


	public void setAdlCd(String adlCd) {
		this.adlCd = adlCd;
	}


	public String getOrgShnm() {
		return orgShnm;
	}


	public void setOrgShnm(String orgShnm) {
		this.orgShnm = orgShnm;
	}


	public String getOrgTp() {
		return orgTp;
	}


	public void setOrgTp(String orgTp) {
		this.orgTp = orgTp;
	}


	public String getLrNm() {
		return lrNm;
	}


	public void setLrNm(String lrNm) {
		this.lrNm = lrNm;
	}


	public String getOrgScal() {
		return orgScal;
	}


	public void setOrgScal(String orgScal) {
		this.orgScal = orgScal;
	}


	public String getMenb() {
		return menb;
	}


	public void setMenb(String menb) {
		this.menb = menb;
	}


	public String getWeb() {
		return web;
	}


	public void setWeb(String web) {
		this.web = web;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
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


	public WrAdmaB() {
		// TODO Auto-generated constructor stub
	}

}
