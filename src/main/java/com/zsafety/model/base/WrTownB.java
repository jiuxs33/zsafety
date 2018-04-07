package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_town_b")
public class WrTownB {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="town_cd",length=9)
	private String townCd;
	
	@Column(name="town_nm",length=100,nullable=false)
	private String townNm;
	@Column(name="ad_shnm",length=4)
	private String adShnm;
	@Column(name="ad_a")
	private float adA;
	@Column(name="ts",nullable=false)
	private Date ts;
	@Column(name="nt",length=256)
	private String nt;
	
	
	public String getTownCd() {
		return townCd;
	}

	public void setTownCd(String townCd) {
		this.townCd = townCd;
	}

	public String getTownNm() {
		return townNm;
	}

	public void setTownNm(String townNm) {
		this.townNm = townNm;
	}

	public String getAdShnm() {
		return adShnm;
	}

	public void setAdShnm(String adShnm) {
		this.adShnm = adShnm;
	}

	public float getAdA() {
		return adA;
	}

	public void setAdA(float adA) {
		this.adA = adA;
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

	public WrTownB() {
		
	}

}
