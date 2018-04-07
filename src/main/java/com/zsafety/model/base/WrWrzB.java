package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_wrz_b")
public class WrWrzB {

	public WrWrzB() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="wrz_cd",length=7)
	private String wrzCd;
	
	@Column(name="wrz_nm",length=100,nullable=false)
	private String wrzNm;
	
	@Column(name="wrz_a",precision=10,scale=2)
	private float wrzA;
	
	@Column(name="hill_zone_a",precision=10,scale=2)
	private float hillZoneA;
	
	@Column(name="plai_a",precision=10,scale=2)
	private float plaiA;
	
	@Column(name="avg_p",precision=12,scale=3)
	private float avgP;
	
	@Column(name="avg_wat",precision=12,scale=3)
	private float avgWat;
	
	@Column(name="avg_surf_wat",precision=12,scale=3)
	private float avgSurfWat;
	
	@Column(name="avg_gw_wat",precision=12,scale=3)
	private float avgGwWat;
	
	@Column(name="avg_sg_wat",precision=12,scale=3)
	private float avgSgWat;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	
	public String getWrzCd() {
		return wrzCd;
	}
	public void setWrzCd(String wrzCd) {
		this.wrzCd = wrzCd;
	}
	public String getWrzNm() {
		return wrzNm;
	}
	public void setWrzNm(String wrzNm) {
		this.wrzNm = wrzNm;
	}
	public float getWrzA() {
		return wrzA;
	}
	public void setWrzA(float wrzA) {
		this.wrzA = wrzA;
	}
	public float getHillZoneA() {
		return hillZoneA;
	}
	public void setHillZoneA(float hillZoneA) {
		this.hillZoneA = hillZoneA;
	}
	public float getPlaiA() {
		return plaiA;
	}
	public void setPlaiA(float plaiA) {
		this.plaiA = plaiA;
	}
	public float getAvgP() {
		return avgP;
	}
	public void setAvgP(float avgP) {
		this.avgP = avgP;
	}
	public float getAvgWat() {
		return avgWat;
	}
	public void setAvgWat(float avgWat) {
		this.avgWat = avgWat;
	}
	public float getAvgSurfWat() {
		return avgSurfWat;
	}
	public void setAvgSurfWat(float avgSurfWat) {
		this.avgSurfWat = avgSurfWat;
	}
	public float getAvgGwWat() {
		return avgGwWat;
	}
	public void setAvgGwWat(float avgGwWat) {
		this.avgGwWat = avgGwWat;
	}
	public float getAvgSgWat() {
		return avgSgWat;
	}
	public void setAvgSgWat(float avgSgWat) {
		this.avgSgWat = avgSgWat;
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
