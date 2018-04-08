package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_sws_b")
public class WrSwsB {

	public WrSwsB() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sws_cd",columnDefinition="char(12)")
	private String swsCd;
	
	@Column(name="sws_nm",columnDefinition="varchar(100)")
	private String swsNm;
	
	@Column(name="sws_tp",columnDefinition="char(1)")
	private String swsTp;
	
	@Column(name="wat_a",precision=7,scale=1)
	private float watA;
	
	@Column(name="wq_goal",columnDefinition="varchar(6)")
	private String wqGoal;
	
	@Column(name="cons_cond",columnDefinition="char(1)")
	private String consCond;
	
	@Column(name="put_prod_tm")
	private Date putProdTm;
	
	@Column(name="run_cond",columnDefinition="char(1)")
	private String runCond;
	
	@Column(name="ws_cond",columnDefinition="char(1)")
	private String wsCond;
	
	@Column(name="ws_obj",columnDefinition="char(10)")
	private String wsObj;
	
	@Column(name="dyws_pp",precision=6,scale=2)
	private float dywsPp;
	
	@Column(name="dyws_w",precision=10,scale=3)
	private float dywsW;
	
	@Column(name="ddws_w",precision=10,scale=3)
	private float ddwsW;
	
	@Column(name="whs_man_cd",columnDefinition="char(9)")
	private String whsManCd;
	
	@Column(name="whs_appr_cd",columnDefinition="char(9)")
	private String whsApprCd;
	
	@Column(name="em_cd",columnDefinition="char(9)")
	private String emCd;
	
	@Column(name="mon_g",columnDefinition="char(1)")
	private String monG;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",columnDefinition="varchar(256)")
	private String nt;
	
	public String getSwsCd() {
		return swsCd;
	}
	public void setSwsCd(String swsCd) {
		this.swsCd = swsCd;
	}
	public String getSwsNm() {
		return swsNm;
	}
	public void setSwsNm(String swsNm) {
		this.swsNm = swsNm;
	}
	public String getSwsTp() {
		return swsTp;
	}
	public void setSwsTp(String swsTp) {
		this.swsTp = swsTp;
	}
	public float getWatA() {
		return watA;
	}
	public void setWatA(float watA) {
		this.watA = watA;
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
	public String getWsCond() {
		return wsCond;
	}
	public void setWsCond(String wsCond) {
		this.wsCond = wsCond;
	}
	public String getWsObj() {
		return wsObj;
	}
	public void setWsObj(String wsObj) {
		this.wsObj = wsObj;
	}
	public float getDywsPp() {
		return dywsPp;
	}
	public void setDywsPp(float dywsPp) {
		this.dywsPp = dywsPp;
	}
	public float getDywsW() {
		return dywsW;
	}
	public void setDywsW(float dywsW) {
		this.dywsW = dywsW;
	}
	public float getDdwsW() {
		return ddwsW;
	}
	public void setDdwsW(float ddwsW) {
		this.ddwsW = ddwsW;
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
	public String getEmCd() {
		return emCd;
	}
	public void setEmCd(String emCd) {
		this.emCd = emCd;
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
