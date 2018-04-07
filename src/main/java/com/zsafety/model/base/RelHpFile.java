package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 水电站与多媒体资料的关系
 * */
@Entity
@Table(name="rel_hp_file")
public class RelHpFile {

	public RelHpFile() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="hp_cd",length=12,nullable=false)
	private String hpCd;
	
	@Column(name="file_cd",length=32)
	private String fileCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",length=256)
	private String nt;
	
	public String getFileCd() {
		return fileCd;
	}
	public void setFileCd(String fileCd) {
		this.fileCd = fileCd;
	}
	public String getHpCd() {
		return hpCd;
	}
	public void setHpCd(String hpCd) {
		this.hpCd = hpCd;
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
