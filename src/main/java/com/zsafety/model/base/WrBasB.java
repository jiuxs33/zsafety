package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_bas_b")
public class WrBasB {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bas_cd")
	private String basCd;
	
	@Column(name="bas_nm",nullable=true,length=100)
	private String basNm;
	@Column(name="bas_g",nullable=true,length=1)
	private String basG;
	@Column(name="bas_a")
	private float basA;
	@Column(name="rs_tot_len")
	private float rsTotLen;
	@Column(name="max_elev")
	private float maxElev;
	@Column(name="min_elev")
	private float minElev;
	@Column(name="dat_tp")
	private String datTp;
	@Column(name="ts",nullable=true)
	private Date ts;
	@Column(name="nt",length=256)
	private String nt;
	public String getBasCd() {
		return basCd;
	}
	public void setBasCd(String basCd) {
		this.basCd = basCd;
	}
	public String getBasNm() {
		return basNm;
	}
	public void setBasNm(String basNm) {
		this.basNm = basNm;
	}
	public String getBasG() {
		return basG;
	}
	public void setBasG(String basG) {
		this.basG = basG;
	}
	public float getBasA() {
		return basA;
	}
	public void setBasA(float basA) {
		this.basA = basA;
	}
	public float getRsTotLen() {
		return rsTotLen;
	}
	public void setRsTotLen(float rsTotLen) {
		this.rsTotLen = rsTotLen;
	}
	public float getMaxElev() {
		return maxElev;
	}
	public void setMaxElev(float maxElev) {
		this.maxElev = maxElev;
	}
	public float getMinElev() {
		return minElev;
	}
	public void setMinElev(float minElev) {
		this.minElev = minElev;
	}
	public String getDatTp() {
		return datTp;
	}
	public void setDatTp(String datTp) {
		this.datTp = datTp;
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
	public WrBasB() {
		
	}
}
