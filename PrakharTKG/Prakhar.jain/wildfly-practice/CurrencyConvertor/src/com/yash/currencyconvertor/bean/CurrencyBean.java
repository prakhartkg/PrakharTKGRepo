package com.yash.currencyconvertor.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.yash.currencyconvertor.service.convertorBeanLocal;

@ManagedBean
@RequestScoped
public class CurrencyBean {
	private String typeofammount;
	private float amount;
	private double convertedAmount;
	
	@EJB
	private convertorBeanLocal convertorBean;
	

	
	public String getTypeofammount() {
		return typeofammount;
	}



	public void setTypeofammount(String typeofammount) {
		this.typeofammount = typeofammount;
	}



	public float getAmount() {
		return amount;
	}



	public void setAmount(float amount) {
		this.amount = amount;
	}



	public double getConvertedAmount() {
		return convertedAmount;
	}



	public void setConvertedAmount(double convertedAmount) {
		this.convertedAmount = convertedAmount;
	}


	public String convertor(){
		convertedAmount=convertorBean.convertor(amount,typeofammount);
		return null;
	}
}
