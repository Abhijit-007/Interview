package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Deal {

	@Id
	int dealId;
	String dealProduct;
	int startTime;
	int endTime;
	int totalItem;
	public int getTotalItem() {
		return totalItem;
	}
	public void setDealId(int dealId) {
		this.dealId = dealId;
	}
	public String getDealProduct() {
		return dealProduct;
	}
	public void setDealProduct(String dealProduct) {
		this.dealProduct = dealProduct;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}
	public int getDealId() {
		return dealId;
	}
	
}
