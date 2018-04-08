package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_well_b")
public class WrWellB {

	public WrWellB() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="well_cd",columnDefinition="char(12)")
	private String wellCd;
	
	@Column(name="well_nm",columnDefinition="varchar(100)",nullable=false)
	private String wellNm;
	
	@Column(name="aper",precision=6)
	private int aper;
	
	@Column(name="well_dep",precision=6,scale=2)
	private float wellDep;
	
	@Column(name="shaf_sink_dt")
	private Date shafSinkDt;
	
	@Column(name="mind_bed",columnDefinition="char(1)")
	private String mindBed;
	
	@Column(name="run_cond",columnDefinition="char(1)")
	private String runCond;
	
	@Column(name="des_q",precision=9,scale=1)
	private float desQ;
	
	@Column(name="stat_z",precision=5,scale=2)
	private float statZ;
	
	@Column(name="dyn_z",precision=5,scale=2)
	private float dynZ;
	
	@Column(name="wq_cond",columnDefinition="varchar(100)")
	private String wqCond;
	
	@Column(name="eng_man_cd",columnDefinition="char(9)",nullable=false)
	private String engManCd;
	
	@Column(name="ws_reg",columnDefinition="varchar(256)")
	private String wsReg;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",columnDefinition="varchar(256)")
	private String nt;

	public String getWellCd() {
		return wellCd;
	}

	public void setWellCd(String wellCd) {
		this.wellCd = wellCd;
	}

	public String getWellNm() {
		return wellNm;
	}

	public void setWellNm(String wellNm) {
		this.wellNm = wellNm;
	}

	public int getAper() {
		return aper;
	}

	public void setAper(int aper) {
		this.aper = aper;
	}

	public float getWellDep() {
		return wellDep;
	}

	public void setWellDep(float wellDep) {
		this.wellDep = wellDep;
	}

	public Date getShafSinkDt() {
		return shafSinkDt;
	}

	public void setShafSinkDt(Date shafSinkDt) {
		this.shafSinkDt = shafSinkDt;
	}

	public String getMindBed() {
		return mindBed;
	}

	public void setMindBed(String mindBed) {
		this.mindBed = mindBed;
	}

	public String getRunCond() {
		return runCond;
	}

	public void setRunCond(String runCond) {
		this.runCond = runCond;
	}

	public float getDesQ() {
		return desQ;
	}

	public void setDesQ(float desQ) {
		this.desQ = desQ;
	}

	public float getStatZ() {
		return statZ;
	}

	public void setStatZ(float statZ) {
		this.statZ = statZ;
	}

	public float getDynZ() {
		return dynZ;
	}

	public void setDynZ(float dynZ) {
		this.dynZ = dynZ;
	}

	public String getWqCond() {
		return wqCond;
	}

	public void setWqCond(String wqCond) {
		this.wqCond = wqCond;
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
