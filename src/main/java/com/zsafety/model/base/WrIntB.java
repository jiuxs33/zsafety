package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_int_b")
public class WrIntB {

	public WrIntB() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="int_cd",columnDefinition="char(12)")
	private String intCd;
	
	@Column(name="int_nm",columnDefinition="varchar(100)",nullable=false)
	private String intNm;
	
	@Column(name="int_tp",columnDefinition="char(1)")
	private String intTp;
	
	@Column(name="from_int_dt")
	private Date fromIntDt;
	
	@Column(name="max_perm_q",precision=9,length=1)
	private float maxPermQ;
	
	@Column(name="des_q",precision=9,length=1)
	private float desQ;
	
	@Column(name="perm_ww",precision=10,scale=3)
	private float permWw;
	
	@Column(name="run_cond",columnDefinition="char(1)")
	private String runCond;
	
	@Column(name="eng_man_cd",columnDefinition="char(9)")
	private String engManCd;
	
	@Column(name="ws_reg",columnDefinition="varchar(256)")
	private String wsReg;
	
	@Column(name="ts",nullable=false)
	private Date ts;
	
	@Column(name="nt",columnDefinition="varchar(256)")
	private String nt;

	public String getIntCd() {
		return intCd;
	}

	public void setIntCd(String intCd) {
		this.intCd = intCd;
	}

	public String getIntNm() {
		return intNm;
	}

	public void setIntNm(String intNm) {
		this.intNm = intNm;
	}

	public String getIntTp() {
		return intTp;
	}

	public void setIntTp(String intTp) {
		this.intTp = intTp;
	}

	public Date getFromIntDt() {
		return fromIntDt;
	}

	public void setFromIntDt(Date fromIntDt) {
		this.fromIntDt = fromIntDt;
	}

	public float getMaxPermQ() {
		return maxPermQ;
	}

	public void setMaxPermQ(float maxPermQ) {
		this.maxPermQ = maxPermQ;
	}

	public float getDesQ() {
		return desQ;
	}

	public void setDesQ(float desQ) {
		this.desQ = desQ;
	}

	public float getPermWw() {
		return permWw;
	}

	public void setPermWw(float permWw) {
		this.permWw = permWw;
	}

	public String getRunCond() {
		return runCond;
	}

	public void setRunCond(String runCond) {
		this.runCond = runCond;
	}

	public String getEngManCd() {
		return engManCd;
	}

	public void setEngManCd(String engManCd) {
		this.engManCd = engManCd;
	}

	public String getWsReg() {
		return wsReg;
	}

	public void setWsReg(String wsReg) {
		this.wsReg = wsReg;
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
