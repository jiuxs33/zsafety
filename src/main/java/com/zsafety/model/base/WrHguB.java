package com.zsafety.model.base;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_hgu_b")
public class WrHguB {

	@Id
	@Column(name="hgu_cd",length=8)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String hguCd;
	
	@Column(name="hgu_nm",length=100,nullable=true)
	private String hguNm;
	
	@Column(name="hgu_a")
	private float hguA;
	
	@Column(name="hgu_char",length=256)
	private String hguChar;
	
	@Column(name="hgu_caus",length=256)
	private String hguCaus;
	
	@Column(name="ts",nullable=true)
	private Date ts;
	@Column(name="nt",length=256)
	private String nt;
	public String getHguCd() {
		return hguCd;
	}
	public void setHguCd(String hguCd) {
		this.hguCd = hguCd;
	}
	public String getHguNm() {
		return hguNm;
	}
	public void setHguNm(String hguNm) {
		this.hguNm = hguNm;
	}
	public float getHguA() {
		return hguA;
	}
	public void setHguA(float hguA) {
		this.hguA = hguA;
	}
	public String getHguChar() {
		return hguChar;
	}
	public void setHguChar(String hguChar) {
		this.hguChar = hguChar;
	}
	public String getHguCaus() {
		return hguCaus;
	}
	public void setHguCaus(String hguCaus) {
		this.hguCaus = hguCaus;
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
	public WrHguB() {
		
	}
}
