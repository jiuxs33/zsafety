package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_gws_b")
public class WrGwsB {

	public WrGwsB() {
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="gws_cd",columnDefinition="char(12)")
	private String gwsCd;
	
	@Column(name="gws_nm",columnDefinition="varchar(100)",nullable=false)
	private String gwsNm;
	
	@Column(name="gws_a",precision=7,scale=1)
	private float gwsA;
	
	@Column(name="rang_desc",columnDefinition="varchar(100)")
	private String rangDesc;
	
	@Column(name="wq_goal",columnDefinition="varchar(6)")
	private String wqGoal;
	
	@Column(name="cons_cond",columnDefinition="char(1)")
	private String consCond;
	
	@Column(name="put_prod_tm")
	private Date putProdTm;
	
	@Column(name="run_cond",columnDefinition="char(1)")
	private String runCond;
	
	@Column(name="avg_exp_yd",precision=10,scale=3)
	private float avgExpYd;
	
	@Column(name="ws_obj",columnDefinition="char(10)")
	private String wsObj;
	
	@Column(name="des_int",precision=10,scale=3)
	private float desInt;
	
	@Column(name="perm_int",precision=10,scale=3)
	private float permInt;
	
	@Column(name="whs_man_cd",columnDefinition="char(9)",nullable=false)
	private String whsManCd;
	
	@Column(name="whs_appr_cd",columnDefinition="char(9)",nullable=false)
	private String whsApprCd;
	
	@Column(name="mon_g",columnDefinition="char(1)")
	private String monG;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",columnDefinition="varchar(256)")
	private String nt;

	public String getGwsCd() {
		return gwsCd;
	}

	public void setGwsCd(String gwsCd) {
		this.gwsCd = gwsCd;
	}

	public String getGwsNm() {
		return gwsNm;
	}

	public void setGwsNm(String gwsNm) {
		this.gwsNm = gwsNm;
	}

	public float getGwsA() {
		return gwsA;
	}

	public void setGwsA(float gwsA) {
		this.gwsA = gwsA;
	}

	public String getRangDesc() {
		return rangDesc;
	}

	public void setRangDesc(String rangDesc) {
		this.rangDesc = rangDesc;
	}

	public String getWqGoal() {
		return wqGoal;
	}

	public void setWqGoal(String wqGoal) {
		this.wqGoal = wqGoal;
	}

	public String getConsCond() {
		return consCond;
	}

	public void setConsCond(String consCond) {
		this.consCond = consCond;
	}

	public Date getPutProdTm() {
		return putProdTm;
	}

	public void setPutProdTm(Date putProdTm) {
		this.putProdTm = putProdTm;
	}

	public String getRunCond() {
		return runCond;
	}

	public void setRunCond(String runCond) {
		this.runCond = runCond;
	}

	public float getAvgExpYd() {
		return avgExpYd;
	}

	public void setAvgExpYd(float avgExpYd) {
		this.avgExpYd = avgExpYd;
	}

	public String getWsObj() {
		return wsObj;
	}

	public void setWsObj(String wsObj) {
		this.wsObj = wsObj;
	}

	public float getDesInt() {
		return desInt;
	}

	public void setDesInt(float desInt) {
		this.desInt = desInt;
	}

	public float getPermInt() {
		return permInt;
	}

	public void setPermInt(float permInt) {
		this.permInt = permInt;
	}

	public String getWhsManCd() {
		return whsManCd;
	}

	public void setWhsManCd(String whsManCd) {
		this.whsManCd = whsManCd;
	}

	public String getWhsApprCd() {
		return whsApprCd;
	}

	public void setWhsApprCd(String whsApprCd) {
		this.whsApprCd = whsApprCd;
	}

	public String getMonG() {
		return monG;
	}

	public void setMonG(String monG) {
		this.monG = monG;
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
