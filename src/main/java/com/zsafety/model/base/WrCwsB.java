package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_cws_b")
public class WrCwsB {

	public WrCwsB() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cws_cd",length=12)
	private String cwsCd;
	
	@Column(name="cws_nm",length=100,nullable=false)
	private String cwsNm;
	
	@Column(name="cws_tp",length=1)
	private String cwsTp;
	
	@Column(name="des_ws_scal",precision=8,scale=1)
	private float desWsScal;
	
	@Column(name="des_ws_pp")
	private int desWsPp;
	
	@Column(name="san_lic_sn",length=40)
	private String sanLicSn;
	
	@Column(name="ws_reg",length=256)
	private String wsReg;
	
	@Column(name="ben_vil_num")
	private int benVilNum;
	
	@Column(name="charg_form",length=1)
	private String chargForm;
	
	@Column(name="run_cond",length=1)
	private String runCond;
	
	@Column(name="eng_man_cd",length=9,nullable=false)
	private String engManCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	public String getCwsCd() {
		return cwsCd;
	}
	public void setCwsCd(String cwsCd) {
		this.cwsCd = cwsCd;
	}
	public String getCwsNm() {
		return cwsNm;
	}
	public void setCwsNm(String cwsNm) {
		this.cwsNm = cwsNm;
	}
	public String getCwsTp() {
		return cwsTp;
	}
	public void setCwsTp(String cwsTp) {
		this.cwsTp = cwsTp;
	}
	public float getDesWsScal() {
		return desWsScal;
	}
	public void setDesWsScal(float desWsScal) {
		this.desWsScal = desWsScal;
	}
	public String getSanLicSn() {
		return sanLicSn;
	}
	public void setSanLicSn(String sanLicSn) {
		this.sanLicSn = sanLicSn;
	}
	public String getWsReg() {
		return wsReg;
	}
	public void setWsReg(String wsReg) {
		this.wsReg = wsReg;
	}
	public int getBenVilNum() {
		return benVilNum;
	}
	public void setBenVilNum(int benVilNum) {
		this.benVilNum = benVilNum;
	}
	public String getRunCond() {
		return runCond;
	}
	public void setRunCond(String runCond) {
		this.runCond = runCond;
	}
	public String getEngManCd() {
		return engManCd;
	}
	public void setEngManCd(String engManCd) {
		this.engManCd = engManCd;
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
	public int getDesWsPp() {
		return desWsPp;
	}
	public void setDesWsPp(int desWsPp) {
		this.desWsPp = desWsPp;
	}
	public String getChargForm() {
		return chargForm;
	}
	public void setChargForm(String chargForm) {
		this.chargForm = chargForm;
	}
	
}
