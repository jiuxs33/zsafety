package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_chan_b")
public class WrChanB {

	public WrChanB() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="chan_cd",length=12)
	private String chanCd;
	
	@Column(name="chan_nm",length=100)
	private String chanNm;
	
	@Column(name="chan_g",length=1)
	private String chanG;
	
	@Column(name="chan_des_q",precision=9,scale=1)
	private float chanDesQ;
	
	@Column(name="leak_r",precision=4,scale=3)
	private float leakR;
	
	@Column(name="chan_len",precision=7,scale=1)
	private float chanLen;
	
	@Column(name="lin_len",precision=7,scale=1)
	private float linLen;
	
	@Column(name="run_cond",length=1)
	private String runCond;
	
	@Column(name="eng_man_cd",length=9,nullable=false)
	private String engManCd;
	
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
	public String getChanNm() {
		return chanNm;
	}
	public void setChanNm(String chanNm) {
		this.chanNm = chanNm;
	}
	public String getChanG() {
		return chanG;
	}
	public void setChanG(String chanG) {
		this.chanG = chanG;
	}
	public float getChanDesQ() {
		return chanDesQ;
	}
	public void setChanDesQ(float chanDesQ) {
		this.chanDesQ = chanDesQ;
	}
	public float getLeakR() {
		return leakR;
	}
	public void setLeakR(float leakR) {
		this.leakR = leakR;
	}
	public float getChanLen() {
		return chanLen;
	}
	public void setChanLen(float chanLen) {
		this.chanLen = chanLen;
	}
	public float getLinLen() {
		return linLen;
	}
	public void setLinLen(float linLen) {
		this.linLen = linLen;
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
	
	
}
