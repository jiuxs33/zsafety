package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_lk_b")
public class WrLkB {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="lk_cd",length=12)
	private String lkCd;
	
	@Column(name="lk_nm",length=100,nullable=false)
	private String lkNm;
	@Column(name="wat_a")
	private float watA;
	@Column(name="sfw_prop",length=1)
	private String sfwProp;
	@Column(name="avg_dep")
	private float avgDep;
	@Column(name="max_dep")
	private float maxDep;
	@Column(name="lk_v")
	private float lkV;
	@Column(name="ts",nullable=false)
	private Date ts;
	@Column(name="nt")
	private String nt;
	
	public WrLkB() {
	}
	
	public String getLkCd() {
		return lkCd;
	}
	public void setLkCd(String lkCd) {
		this.lkCd = lkCd;
	}
	public String getLkNm() {
		return lkNm;
	}
	public void setLkNm(String lkNm) {
		this.lkNm = lkNm;
	}
	public float getWatA() {
		return watA;
	}
	public void setWatA(float watA) {
		this.watA = watA;
	}
	public String getSfwProp() {
		return sfwProp;
	}
	public void setSfwProp(String sfwProp) {
		this.sfwProp = sfwProp;
	}
	public float getAvgDep() {
		return avgDep;
	}
	public void setAvgDep(float avgDep) {
		this.avgDep = avgDep;
	}
	public float getMaxDep() {
		return maxDep;
	}
	public void setMaxDep(float maxDep) {
		this.maxDep = maxDep;
	}
	public float getLkV() {
		return lkV;
	}
	public void setLkV(float lkV) {
		this.lkV = lkV;
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
