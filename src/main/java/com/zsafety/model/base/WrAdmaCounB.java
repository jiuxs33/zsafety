package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_adma_coun_b")
public class WrAdmaCounB {

	public WrAdmaCounB() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="org_cd",length=9)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String orgCd;
	
	@Column(name="maj_func",length=1024)
	private String majFunc;
	@Column(name="est_pp")
	private int estPp;
	@Column(name="adm_cont",length=1024)
	private String admCont;
	@Column(name="is_imp_war")
	private boolean isImpWar;
	@Column(name="war_dt")
	private Date warDt;
	@Column(name="ts",nullable=false)
	private Date ts;
	@Column(name="nt",length=256)
	private String nt;
	public String getOrgCd() {
		return orgCd;
	}
	public void setOrgCd(String orgCd) {
		this.orgCd = orgCd;
	}
	public String getMajFunc() {
		return majFunc;
	}
	public void setMajFunc(String majFunc) {
		this.majFunc = majFunc;
	}
	public int getEstPp() {
		return estPp;
	}
	public void setEstPp(int estPp) {
		this.estPp = estPp;
	}
	public String getAdmCont() {
		return admCont;
	}
	public void setAdmCont(String admCont) {
		this.admCont = admCont;
	}
	public boolean isImpWar() {
		return isImpWar;
	}
	public void setImpWar(boolean isImpWar) {
		this.isImpWar = isImpWar;
	}
	public Date getWarDt() {
		return warDt;
	}
	public void setWarDt(Date warDt) {
		this.warDt = warDt;
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
