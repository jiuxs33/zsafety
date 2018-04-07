package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_rv_b")
public class WrRvB {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rv_cd",length=12)
	private String rvCd;
	
	@Column(name="rv_nm",length=100,nullable=false)
	private String rvNm;
	
	@Column(name="rv_g",length=1,nullable=false)
	private String rvG;
	
	@Column(name="rv_len")
	private float rvLen;
	
	@Column(name="rv_ag")
	private float rvAg;
	
	@Column(name="if_inn_rv")
	private boolean ifInnRv;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=255)
	private String nt;
	
	public String getRvCd() {
		return rvCd;
	}
	public void setRvCd(String rvCd) {
		this.rvCd = rvCd;
	}
	public String getRvNm() {
		return rvNm;
	}
	public void setRvNm(String rvNm) {
		this.rvNm = rvNm;
	}
	public String getRvG() {
		return rvG;
	}
	public void setRvG(String rvG) {
		this.rvG = rvG;
	}
	public float getRvLen() {
		return rvLen;
	}
	public void setRvLen(float rvLen) {
		this.rvLen = rvLen;
	}
	public float getRvAg() {
		return rvAg;
	}
	public void setRvAg(float rvAg) {
		this.rvAg = rvAg;
	}
	public boolean isIfInnRv() {
		return ifInnRv;
	}
	public void setIfInnRv(boolean ifInnRv) {
		this.ifInnRv = ifInnRv;
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
	
	public WrRvB(){
		
	}
}
