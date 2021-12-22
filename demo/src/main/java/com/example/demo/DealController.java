package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Deal;
import com.example.demo.service.DealService;

@RestController
public class DealController {
	
	@Autowired
	DealService dealService;
	
	
	@PostMapping("addDeal")
	public Deal addDeal(Deal deal) {
		return  dealService.addDeal(deal);
	}
	
	@DeleteMapping("deleteDeal/{dealID}")
	public String deleteDeal(@PathVariable("dealID") int dealID) {
		return dealService.deleteDeal(dealID);
	}
	
	@PostMapping("claimDeal/{dealId}/{endItem}/{totalItem}")
	public Deal claimDeal(@PathVariable("dealId") int dealId,@PathVariable("endItem") int endItem,@PathVariable("totalItem") int totalItem) {
		return dealService.calimDeal(dealId,endItem,totalItem);
	}
	
	@PutMapping("updateDeal/{dealId}/{noOfItems}/{endTime}")
	public Deal updateDeal(@PathVariable("dealId") int dealId,
			@PathVariable("noOfItems") int noOfItems,
			@PathVariable("endTime") int endTime) {
		return dealService.updateDeal(dealId,noOfItems,endTime);
		
	}

}
