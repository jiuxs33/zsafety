package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rel_gws_file")
public class RelGwsFile {

	public RelGwsFile() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="gws_cd",columnDefinition="char(12)")
	private String gwsCd;
	
	@Column(name="file_cd",columnDefinition="char(32)",nullable=false)
	private String fileCd;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",columnDefinition="varchar(256)")
	private String nt;

	public String getGwsCd() {
		return gwsCd;
	}

	public void setGwsCd(String gwsCd) {
		this.gwsCd = gwsCd;
	}

	public String getFileCd() {
		return fileCd;
	}

	public void setFileCd(String fileCd) {
		this.fileCd = fileCd;
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
