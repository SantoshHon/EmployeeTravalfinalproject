package com.mindgate.main.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.TravelDetails;
import com.mindgate.main.service.TravelDetailsServiceInterface;



@RestController
@RequestMapping("travelDetals")
public class TraveldetailsController {
	@Autowired
	private TravelDetailsServiceInterface travelDetailsServiceInterface;
	@RequestMapping(value = "traveldetail", method = RequestMethod.POST)
	public boolean addTravelDetails(@RequestBody TravelDetails travelDetails) {
		return travelDetailsServiceInterface.addTravelDetails(travelDetails);
		
	}
	@RequestMapping(value = "traveldetail", method = RequestMethod.PUT)
	public boolean updateTravelDetailsByTravelDetailsId(@RequestBody TravelDetails travelDetails)
	{
		return travelDetailsServiceInterface.updateTravelDetailsByTravelDetailsId(travelDetails) ;
		
	}
	@RequestMapping(value = "traveldetail/{id}", method = RequestMethod.DELETE)
	public boolean deleteTravelDetailsByTravelDetailsId(@PathVariable("id") int travelDetailsId)
	{
		return travelDetailsServiceInterface.deleteTravelDetailsByTravelDetailsId(travelDetailsId);
		
	}
	@RequestMapping(value = "traveldetail/{id}", method = RequestMethod.GET)
	public TravelDetails getTravelDetailsByTravelDetailsId(@PathVariable("id") int travelDetailsId)
	{
		return travelDetailsServiceInterface.getTravelDetailsByTravelDetailsId(travelDetailsId);
		
	}
	@RequestMapping(value = "traveldetail", method = RequestMethod.GET)
	public List<TravelDetails> getAllTravelDetails()
	{
		return travelDetailsServiceInterface.getAllTravelDetails();
		
	}
	
}
	

