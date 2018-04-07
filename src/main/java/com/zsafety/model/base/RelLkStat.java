package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 湖泊与水文测站的关系
 * */
@Entity
@Table(name="rel_lk_stat")
public class RelLkStat {

	public RelLkStat() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stcd",length=8)
	private String stcd;
	
	@Column(name="lk_cd",length=7,nullable=false)
	private String lkCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	public String getLkCd() {
		return lkCd;
	}
	public void setLkCd(String lkCd) {
		this.lkCd = lkCd;
	}
	public String getStcd() {
		return stcd;
	}
	public void setStcd(String stcd) {
		this.stcd = stcd;
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
