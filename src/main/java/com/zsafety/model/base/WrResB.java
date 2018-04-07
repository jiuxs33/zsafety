package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_res_b")
public class WrResB {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="res_cd",length=12)
	private String resCd;
	
	@Column(name="res_nm",length=100,nullable=false)
	private String resNm;
	
	@Column(name="loc",length=200)
	private String loc;
	
	@Column(name="comp_ym",length=6)
	private String compYm;
	
	@Column(name="proj_scal",length=1)
	private String projScal;
	
	@Column(name="dat_tp",length=2)
	private String datTp;
	
	@Column(name="cat_a")
	private float cata;
	
	@Column(name="des_fz")
	private float desFz;
	
	@Column(name="tot_v")
	private float totV;
	
	@Column(name="frsc_v")
	private float frscV;
	
	@Column(name="norm_wz")
	private float normWz;
	
	@Column(name="cf_z")
	private float cfz;
	
	@Column(name="util_v")
	private float utilV;
	
	@Column(name="fs_z")
	private float fsz;
	
	@Column(name="fs_z_v")
	private float fszv;
	
	@Column(name="dead_z")
	private float deadZ;
	
	@Column(name="dead_v")
	private float deadV;
	
	@Column(name="res_reg_tp",length=1)
	private String resRegTp;
	
	@Column(name="min_disc")
	private float minDisc;
	
	@Column(name="st_end_len")
	private float stEndLen;
	
	@Column(name="rhcc",length=256)
	private String rhcc;
	
	@Column(name="run_cond",length=1)
	private String runCond;
	
	@Column(name="eng_man_cd",length=9)
	private String engManCd;
	
	@Column(name="ws_reg",length=256)
	private String wsReg;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	public String getResCd() {
		return resCd;
	}

	public void setResCd(String resCd) {
		this.resCd = resCd;
	}

	public String getResNm() {
		return resNm;
	}

	public void setResNm(String resNm) {
		this.resNm = resNm;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getCompYm() {
		return compYm;
	}

	public void setCompYm(String compYm) {
		this.compYm = compYm;
	}

	public String getProjScal() {
		return projScal;
	}

	public void setProjScal(String projScal) {
		this.projScal = projScal;
	}

	public String getDatTp() {
		return datTp;
	}

	public void setDatTp(String datTp) {
		this.datTp = datTp;
	}

	public float getCata() {
		return cata;
	}

	public void setCata(float cata) {
		this.cata = cata;
	}

	public float getDesFz() {
		return desFz;
	}

	public void setDesFz(float desFz) {
		this.desFz = desFz;
	}

	public float getTotV() {
		return totV;
	}

	public void setTotV(float totV) {
		this.totV = totV;
	}

	public float getFrscV() {
		return frscV;
	}

	public void setFrscV(float frscV) {
		this.frscV = frscV;
	}

	public float getNormWz() {
		return normWz;
	}

	public void setNormWz(float normWz) {
		this.normWz = normWz;
	}

	public float getCfz() {
		return cfz;
	}

	public void setCfz(float cfz) {
		this.cfz = cfz;
	}

	public float getUtilV() {
		return utilV;
	}

	public void setUtilV(float utilV) {
		this.utilV = utilV;
	}

	public float getFsz() {
		return fsz;
	}

	public void setFsz(float fsz) {
		this.fsz = fsz;
	}

	public float getFszv() {
		return fszv;
	}

	public void setFszv(float fszv) {
		this.fszv = fszv;
	}

	public float getDeadZ() {
		return deadZ;
	}

	public void setDeadZ(float deadZ) {
		this.deadZ = deadZ;
	}

	public float getDeadV() {
		return deadV;
	}

	public void setDeadV(float deadV) {
		this.deadV = deadV;
	}

	public String getResRegTp() {
		return resRegTp;
	}

	public void setResRegTp(String resRegTp) {
		this.resRegTp = resRegTp;
	}

	public float getMinDisc() {
		return minDisc;
	}

	public void setMinDisc(float minDisc) {
		this.minDisc = minDisc;
	}

	public float getStEndLen() {
		return stEndLen;
	}

	public void setStEndLen(float stEndLen) {
		this.stEndLen = stEndLen;
	}

	public String getRhcc() {
		return rhcc;
	}

	public void setRhcc(String rhcc) {
		this.rhcc = rhcc;
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

	public WrResB() {
		// TODO Auto-generated constructor stub
	}

}
