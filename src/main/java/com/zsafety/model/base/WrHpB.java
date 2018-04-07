package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_hp_b")
public class WrHpB {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="hp_cd",length=12)
	private String hpCd;
	
	@Column(name="hp_nm",length=100,nullable=false)
	private String hpNm;
	
	@Column(name="hp_tp",length=1)
	private String hpTp;
	
	@Column(name="ins_cap")
	private float insCap;
	
	@Column(name="avg_eg")
	private float avgEg;
	
	@Column(name="res_cd",length=12)
	private String resCd;
	
	@Column(name="run_cond",length=1)
	private String runCond;
	
	@Column(name="eng_man_cd",length=9)
	private String engManCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	
	public String getHpCd() {
		return hpCd;
	}


	public void setHpCd(String hpCd) {
		this.hpCd = hpCd;
	}


	public String getHpNm() {
		return hpNm;
	}


	public void setHpNm(String hpNm) {
		this.hpNm = hpNm;
	}


	public String getHpTp() {
		return hpTp;
	}


	public void setHpTp(String hpTp) {
		this.hpTp = hpTp;
	}


	public float getInsCap() {
		return insCap;
	}


	public void setInsCap(float insCap) {
		this.insCap = insCap;
	}


	public float getAvgEg() {
		return avgEg;
	}


	public void setAvgEg(float avgEg) {
		this.avgEg = avgEg;
	}


	public String getResCd() {
		return resCd;
	}


	public void setResCd(String resCd) {
		this.resCd = resCd;
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


	public WrHpB() {
		// TODO Auto-generated constructor stub
	}

}
