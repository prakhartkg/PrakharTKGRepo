package com.yash.currencyconvertor.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class convertorBean
 */
@Stateless
@LocalBean
public class convertorBean implements convertorBeanLocal {

    /**
     * Default constructor. 
     */
    public convertorBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public double convertor(float amount,String typeOfAmount) {
		if(typeOfAmount.equals("Dollar")){
			return 65.36*amount;	
		}
		else if(typeOfAmount.equals("Euro")){
			return 72.07*amount;
		}
		return 0.54*amount;
		
	}

}
