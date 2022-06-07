package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.pojo.LoginDetails;

public interface LoginDetailsServiceInterFace {
	public boolean addLoginDetails(LoginDetails loginDetails);
	public boolean updateLoginDetails(LoginDetails loginDetails);
	public boolean deleteLoginDetails(int loginId);
	public LoginDetails getLoginDetailsByloginId(int loginId);
	public List<LoginDetails>getAllLoginDetails();
	
	
}
