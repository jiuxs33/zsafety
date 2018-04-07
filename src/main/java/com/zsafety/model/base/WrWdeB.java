package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_wde_b")
public class WrWdeB {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="wde_cd",length=12)
	private String wdeCd;
	
	@Column(name="wde_nm",length=100,nullable=false)
	private String wdeNm;
	
	@Column(name="sws_cd",length=12)
	private String swsCd;
	
	@Column(name="line_a",length=256)
	private String lineA;
	
	@Column(name="tot_line_len",precision=7,scale=3)
	private float totLineLen;
	
	@Column(name="intk_a",length=256)
	private String intkA;
	
	@Column(name="wde_tp",length=1)
	private String wdeTp;
	
	@Column(name="cons_cond",length=1)
	private String consCond;
	
	@Column(name="des_wde_q",precision=9,scale=1)
	private float desWdeQ;
	
	@Column(name="des_yr_dw",precision=10,scale=3)
	private float desYrDw;
	
	@Column(name="run_cond",length=1)
	private String runCond;
	
	@Column(name="eng_man_cd",length=9)
	private String engManCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	
	public String getWdeCd() {
		return wdeCd;
	}


	public void setWdeCd(String wdeCd) {
		this.wdeCd = wdeCd;
	}


	public String getWdeNm() {
		return wdeNm;
	}


	public void setWdeNm(String wdeNm) {
		this.wdeNm = wdeNm;
	}


	public String getSwsCd() {
		return swsCd;
	}


	public void setSwsCd(String swsCd) {
		this.swsCd = swsCd;
	}


	public String getLineA() {
		return lineA;
	}


	public void setLineA(String lineA) {
		this.lineA = lineA;
	}


	public float getTotLineLen() {
		return totLineLen;
	}


	public void setTotLineLen(float totLineLen) {
		this.totLineLen = totLineLen;
	}


	public String getIntkA() {
		return intkA;
	}


	public void setIntkA(String intkA) {
		this.intkA = intkA;
	}


	public String getWdeTp() {
		return wdeTp;
	}


	public void setWdeTp(String wdeTp) {
		this.wdeTp = wdeTp;
	}


	public String getConsCond() {
		return consCond;
	}


	public void setConsCond(String consCond) {
		this.consCond = consCond;
	}


	public float getDesWdeQ() {
		return desWdeQ;
	}


	public void setDesWdeQ(float desWdeQ) {
		this.desWdeQ = desWdeQ;
	}


	public float getDesYrDw() {
		return desYrDw;
	}


	public void setDesYrDw(float desYrDw) {
		this.desYrDw = desYrDw;
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


	public WrWdeB() {
		// TODO Auto-generated constructor stub
	}

}
