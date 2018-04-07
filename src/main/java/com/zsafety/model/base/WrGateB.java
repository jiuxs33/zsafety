package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_gate_b")
public class WrGateB {

	public WrGateB() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="gate_cd",length=12)
	private String gateCd;
	
	@Column(name="gate_nm",length=100,nullable=false)
	private String gateNm;
	
	@Column(name="loc",length=200)
	private String loc;
	
	@Column(name="proj_scal",length=1)
	private String projScal;
	
	@Column(name="gate_hole_num")
	private int gateHoleNum;
	
	@Column(name="gate_tw",precision=5,scale=2)
	private float gateTw;
	
	@Column(name="des_gate_q",precision=9,scale=2)
	private float desGateQ;
	
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
	
	public String getGateCd() {
		return gateCd;
	}
	public void setGateCd(String gateCd) {
		this.gateCd = gateCd;
	}
	public String getGateNm() {
		return gateNm;
	}
	public void setGateNm(String gateNm) {
		this.gateNm = gateNm;
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
	public int getGateHoleNum() {
		return gateHoleNum;
	}
	public void setGateHoleNum(int gateHoleNum) {
		this.gateHoleNum = gateHoleNum;
	}
	public float getGateTw() {
		return gateTw;
	}
	public void setGateTw(float gateTw) {
		this.gateTw = gateTw;
	}
	public float getDesGateQ() {
		return desGateQ;
	}
	public void setDesGateQ(float desGateQ) {
		this.desGateQ = desGateQ;
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
