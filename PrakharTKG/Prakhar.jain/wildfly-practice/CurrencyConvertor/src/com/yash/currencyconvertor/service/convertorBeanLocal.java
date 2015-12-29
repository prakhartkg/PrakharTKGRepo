package com.yash.currencyconvertor.service;

import javax.ejb.Local;

@Local
public interface convertorBeanLocal {
	public double convertor(float amount, String typeofammount);
}
