package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.Model.Deal;

@Component
public interface DealService {

	public Deal addDeal(Deal deal);
	public String deleteDeal(int id);
	public Deal calimDeal(int dealId,int endTime,int totalItem);
	public Deal updateDeal(int dealId,int noofitem,int endTime);
	
}
