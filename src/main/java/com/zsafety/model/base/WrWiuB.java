package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_wiu_b")
public class WrWiuB {

	public WrWiuB() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="wiu_cd",columnDefinition="char(9)")
	private String wiuCd;
	
	@Column(name="wiu_nm",columnDefinition="varchar(100)",nullable=false)
	private String wiuNm;
	
	@Column(name="lr_nm",columnDefinition="varchar(30)")
	private String lrNm;
	
	@Column(name="trad_tp",columnDefinition="char(4)")
	private String tradTp;
	
	@Column(name="eco_tp",columnDefinition="char(1)")
	private String ecoTp;
	
	@Column(name="mon_g",columnDefinition="char(1)")
	private String monG;
	
	@Column(name="wiu_tp",columnDefinition="char(1)")
	private String wiuTp;
	
	@Column(name="adl_cd",columnDefinition="char(6)")
	private String adlCd;
	
	@Column(name="web",columnDefinition="varchar(100)")
	private String web;
	
	@Column(name="email",columnDefinition="varchar(100)")
	private String email;
	
	@Column(name="addr",columnDefinition="varchar(100)")
	private String addr;
	
	@Column(name="zip",columnDefinition="char(6)")
	private String zip;
	
	@Column(name="tel",columnDefinition="varchar(22)")
	private String tel;
	
	@Column(name="fax",columnDefinition="varchar(22)")
	private String fax;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",columnDefinition="varchar(100)")
	private String nt;

	public String getWiuCd() {
		return wiuCd;
	}

	public void setWiuCd(String wiuCd) {
		this.wiuCd = wiuCd;
	}

	public String getWiuNm() {
		return wiuNm;
	}

	public void setWiuNm(String wiuNm) {
		this.wiuNm = wiuNm;
	}

	public String getLrNm() {
		return lrNm;
	}

	public void setLrNm(String lrNm) {
		this.lrNm = lrNm;
	}

	public String getTradTp() {
		return tradTp;
	}

	public void setTradTp(String tradTp) {
		this.tradTp = tradTp;
	}

	public String getEcoTp() {
		return ecoTp;
	}

	public void setEcoTp(String ecoTp) {
		this.ecoTp = ecoTp;
	}

	public String getMonG() {
		return monG;
	}

	public void setMonG(String monG) {
		this.monG = monG;
	}

	public String getWiuTp() {
		return wiuTp;
	}

	public void setWiuTp(String wiuTp) {
		this.wiuTp = wiuTp;
	}

	public String getAdlCd() {
		return adlCd;
	}

	public void setAdlCd(String adlCd) {
		this.adlCd = adlCd;
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
	
}
