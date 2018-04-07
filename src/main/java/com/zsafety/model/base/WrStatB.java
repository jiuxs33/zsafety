package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_stat_b")
public class WrStatB {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stcd",length=8)
	private String stCd;
	
	@Column(name="st_nm",length=100,nullable=false)
	private String stNm;
	
	@Column(name="st_tp",length=2)
	private String stTp;
	
	@Column(name="loc",length=200)
	private String loc;
	
	@Column(name="stbk",length=1)
	private String stbk;
	
	@Column(name="flow_dir",length=1)
	private String flowDir;
	
	@Column(name="dat_tp",length=2)
	private String datTp;
	
	@Column(name="dat_elev")
	private float datElev;
	
	@Column(name="mod_bas_val")
	private float modBasVal;
	
	@Column(name="mod_para")
	private float modPara;
	
	@Column(name="mod_tp_a",length=1)
	private String monTpa;
	
	@Column(name="mod_tp_b",length=1)
	private String monTpb;
	
	@Column(name="est_st_ym",length=6)
	private String estStYm;
	
	@Column(name="run_cond",length=1)
	private String runCond;
	
	@Column(name="eng_man_cd",length=9,nullable=false)
	private String engManCd;
	
	@Column(name="pin_yin_cd",length=6)
	private String pinYinCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	public String getStCd() {
		return stCd;
	}

	public void setStCd(String stCd) {
		this.stCd = stCd;
	}

	public String getStNm() {
		return stNm;
	}

	public void setStNm(String stNm) {
		this.stNm = stNm;
	}

	public String getStTp() {
		return stTp;
	}

	public void setStTp(String stTp) {
		this.stTp = stTp;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getStbk() {
		return stbk;
	}

	public void setStbk(String stbk) {
		this.stbk = stbk;
	}

	public String getFlowDir() {
		return flowDir;
	}

	public void setFlowDir(String flowDir) {
		this.flowDir = flowDir;
	}

	public String getDatTp() {
		return datTp;
	}

	public void setDatTp(String datTp) {
		this.datTp = datTp;
	}

	public float getDatElev() {
		return datElev;
	}

	public void setDatElev(float datElev) {
		this.datElev = datElev;
	}

	public float getModBasVal() {
		return modBasVal;
	}

	public void setModBasVal(float modBasVal) {
		this.modBasVal = modBasVal;
	}

	public float getModPara() {
		return modPara;
	}

	public void setModPara(float modPara) {
		this.modPara = modPara;
	}

	public String getMonTpa() {
		return monTpa;
	}

	public void setMonTpa(String monTpa) {
		this.monTpa = monTpa;
	}

	public String getMonTpb() {
		return monTpb;
	}

	public void setMonTpb(String monTpb) {
		this.monTpb = monTpb;
	}

	public String getEstStYm() {
		return estStYm;
	}

	public void setEstStYm(String estStYm) {
		this.estStYm = estStYm;
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

	public String getPinYinCd() {
		return pinYinCd;
	}

	public void setPinYinCd(String pinYinCd) {
		this.pinYinCd = pinYinCd;
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

	public WrStatB() {
		// TODO Auto-generated constructor stub
	}

}
