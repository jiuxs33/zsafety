package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 水库与水文测站的关系
 * */
@Entity
@Table(name="rel_res_stat")
public class RelResStat {

	public RelResStat() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stcd",length=8)
	private String stcd;
	
	@Column(name="res_cd",length=12,nullable=false)
	private String resCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	public String getStcd() {
		return stcd;
	}
	public void setStcd(String stcd) {
		this.stcd = stcd;
	}
	public String getResCd() {
		return resCd;
	}
	public void setResCd(String resCd) {
		this.resCd = resCd;
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
