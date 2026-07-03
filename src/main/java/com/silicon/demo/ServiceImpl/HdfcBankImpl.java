package com.silicon.demo.ServiceImpl;

import org.springframework.stereotype.Service;

import com.silicon.demo.service.Bank;

@Service
public class HdfcBankImpl implements Bank{

	
	@Override
	public String depositeAmount(int amount) {
		// Icici bank will write its own logic  , db call logic will be written here
		return "Amount added in Hdfc Bank :"+ amount;
	}

	@Override
	public void save() {
		//add the save logic
		
	}

}
