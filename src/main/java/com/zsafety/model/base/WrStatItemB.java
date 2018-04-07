package com.zsafety.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wr_stat_item_b")
public class WrStatItemB {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stcd",length=8)
	private String stcd;
	@Column(name="item_p")
	private boolean itemP;
	@Column(name="item_e")
	private boolean itemE;
	@Column(name="item_z",length=1)
	private String itemZ;
	@Column(name="item_q",length=1)
	private String itemQ;
	@Column(name="item_gw_dep")
	private boolean itemGwDep;
	@Column(name="item_wq")
	private boolean itemWq;
	@Column(name="item_land_subs")
	private boolean itemLandSubs;
	@Column(name="item_vsand")
	private boolean itemVsand;
	@Column(name="item_hsand")
	private boolean itemHsand;
	@Column(name="item_icesl")
	private boolean itemIcesl;
	@Column(name="item_tide")
	private boolean itemTide;
	@Column(name="item_othe",length=50)
	private String itemOthe;
	@Column(name="st")
	private Date st;
	@Column(name="nt",length=256)
	private String nt;
	
	
	public String getStcd() {
		return stcd;
	}


	public void setStcd(String stcd) {
		this.stcd = stcd;
	}


	public boolean isItemP() {
		return itemP;
	}


	public void setItemP(boolean itemP) {
		this.itemP = itemP;
	}


	public boolean isItemE() {
		return itemE;
	}


	public void setItemE(boolean itemE) {
		this.itemE = itemE;
	}


	public String getItemZ() {
		return itemZ;
	}


	public void setItemZ(String itemZ) {
		this.itemZ = itemZ;
	}


	public String getItemQ() {
		return itemQ;
	}


	public void setItemQ(String itemQ) {
		this.itemQ = itemQ;
	}


	public boolean isItemGwDep() {
		return itemGwDep;
	}


	public void setItemGwDep(boolean itemGwDep) {
		this.itemGwDep = itemGwDep;
	}


	public boolean isItemWq() {
		return itemWq;
	}


	public void setItemWq(boolean itemWq) {
		this.itemWq = itemWq;
	}


	public boolean isItemLandSubs() {
		return itemLandSubs;
	}


	public void setItemLandSubs(boolean itemLandSubs) {
		this.itemLandSubs = itemLandSubs;
	}


	public boolean isItemVsand() {
		return itemVsand;
	}


	public void setItemVsand(boolean itemVsand) {
		this.itemVsand = itemVsand;
	}


	public boolean isItemHsand() {
		return itemHsand;
	}


	public void setItemHsand(boolean itemHsand) {
		this.itemHsand = itemHsand;
	}


	public boolean isItemIcesl() {
		return itemIcesl;
	}


	public void setItemIcesl(boolean itemIcesl) {
		this.itemIcesl = itemIcesl;
	}


	public boolean isItemTide() {
		return itemTide;
	}


	public void setItemTide(boolean itemTide) {
		this.itemTide = itemTide;
	}


	public String getItemOthe() {
		return itemOthe;
	}


	public void setItemOthe(String itemOthe) {
		this.itemOthe = itemOthe;
	}


	public Date getSt() {
		return st;
	}


	public void setSt(Date st) {
		this.st = st;
	}


	public String getNt() {
		return nt;
	}


	public void setNt(String nt) {
		this.nt = nt;
	}


	public WrStatItemB() {
		// TODO Auto-generated constructor stub
	}

}
