package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_pump_b")
public class WrPumpB {

	public WrPumpB() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pump_cd",length=12)
	private String pumpCd;
	
	@Column(name="pump_nm",length=100,nullable=false)
	private String pumpNm;
	
	@Column(name="loc",length=200)
	private String loc;
	
	@Column(name="proj_scal",length=1)
	private String projScal;
	
	@Column(name="pump_tp",length=1)
	private String pumpTp;
	
	@Column(name="ins_q",precision=9,scale=2)
	private float insQ;
	
	@Column(name="des_head",precision=5,scale=2)
	private float desHead;
	
	@Column(name="pump_num")
	private int pumpNum;
	
	@Column(name="all_equ_ww",precision=8,scale=3)
	private float allEquWw;
	
	@Column(name="run_cond",length=1)
	private String runCond;
	
	@Column(name="eng_man_cd",length=9,nullable=false)
	private String engManCd;
	
	@Column(name="ws_reg",length=256)
	private String wsReg;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;

	public String getPumpCd() {
		return pumpCd;
	}

	public void setPumpCd(String pumpCd) {
		this.pumpCd = pumpCd;
	}

	public String getPumpNm() {
		return pumpNm;
	}

	public void setPumpNm(String pumpNm) {
		this.pumpNm = pumpNm;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getProjScal() {
		return projScal;
	}

	public void setProjScal(String projScal) {
		this.projScal = projScal;
	}

	public String getPumpTp() {
		return pumpTp;
	}

	public void setPumpTp(String pumpTp) {
		this.pumpTp = pumpTp;
	}

	public float getInsQ() {
		return insQ;
	}

	public void setInsQ(float insQ) {
		this.insQ = insQ;
	}

	public float getDesHead() {
		return desHead;
	}

	public void setDesHead(float desHead) {
		this.desHead = desHead;
	}

	public int getPumpNum() {
		return pumpNum;
	}

	public void setPumpNum(int pumpNum) {
		this.pumpNum = pumpNum;
	}

	public float getAllEquWw() {
		return allEquWw;
	}

	public void setAllEquWw(float allEquWw) {
		this.allEquWw = allEquWw;
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

	public String getWsReg() {
		return wsReg;
	}

	public void setWsReg(String wsReg) {
		this.wsReg = wsReg;
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
