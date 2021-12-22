package com.example.demo.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Deal;
import com.example.demo.repo.DealRepo;
import com.example.demo.service.DealService;

@Service
public class DealServiceImpl implements DealService{

	@Autowired
	DealRepo dealRepo;
	
	@Override
	public Deal addDeal(Deal deal) {
		// TODO Auto-generated method stub
		dealRepo.save(deal);
		return deal;
	}

	@Override
	public String deleteDeal(int id) {
		// TODO Auto-generated method stub
		try {
			Deal deal=dealRepo.findById(id).orElse(null);
			dealRepo.delete(deal);
			return "Deleted Successfully";
		} catch (Exception e) {
			return "error while deleting";
		}
		
	}

	@Override
	public Deal calimDeal(int dealId,int endTime,int totalItem) {
		// TODO Auto-generated method stub
		Deal deal=dealRepo.findById(dealId).orElse(null);
		if(deal!=null) {
			if(totalItem>1) {
				return null;
			}
			if(endTime>deal.getEndTime()) {
				return null;
			}
			
			deal.setTotalItem(deal.getTotalItem()-1);
			if(deal.getTotalItem()==0) {
				dealRepo.delete(deal);
				return null;
			}
			dealRepo.save(deal);
			return deal;
			
		}
		return null;
	}

	@Override
	@Transactional
	public Deal updateDeal(int dealId,int noofitem,int endTime) {
		// TODO Auto-generated method stub
		Deal deal=dealRepo.findById(dealId).orElse(null);
		if(deal!=null) {
			deal.setTotalItem(deal.getTotalItem()+noofitem);
			deal.setEndTime(deal.getEndTime()+endTime);
			dealRepo.save(deal);
			return deal;
		}
		return null;
	}

}
