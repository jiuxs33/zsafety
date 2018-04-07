package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_irr_b")
public class WrIrrB {

	public WrIrrB() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="irr_cd",length=12)
	private String irrCd;
	
	@Column(name="irr_nm",length=100,nullable=false)
	private String irrNm;
	
	@Column(name="irr_tp",length=1)
	private String irrTp;
	
	@Column(name="irr_scal",length=1)
	private String irrScal;
	
	@Column(name="des_irr_a",precision=10,scale=2)
	private float desIrrA;
	
	@Column(name="irr_a",precision=10,scale=2)
	private float irrA;
	
	@Column(name="field_irr_a",precision=10,scale=2)
	private float fieldIrrA;
	
	@Column(name="run_cond",length=1)
	private String runCond;
	
	@Column(name="eng_man_cd",length=9,nullable=false)
	private String engManCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	public String getIrrCd() {
		return irrCd;
	}
	public void setIrrCd(String irrCd) {
		this.irrCd = irrCd;
	}
	public String getIrrNm() {
		return irrNm;
	}
	public void setIrrNm(String irrNm) {
		this.irrNm = irrNm;
	}
	public String getIrrTp() {
		return irrTp;
	}
	public void setIrrTp(String irrTp) {
		this.irrTp = irrTp;
	}
	public String getIrrScal() {
		return irrScal;
	}
	public void setIrrScal(String irrScal) {
		this.irrScal = irrScal;
	}
	public float getDesIrrA() {
		return desIrrA;
	}
	public void setDesIrrA(float desIrrA) {
		this.desIrrA = desIrrA;
	}
	public float getIrrA() {
		return irrA;
	}
	public void setIrrA(float irrA) {
		this.irrA = irrA;
	}
	public float getFieldIrrA() {
		return fieldIrrA;
	}
	public void setFieldIrrA(float fieldIrrA) {
		this.fieldIrrA = fieldIrrA;
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
