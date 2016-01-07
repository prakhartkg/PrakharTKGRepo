package com.yash.cdix;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl  implements EmployeeDao {

	@Override
	public List getAllEmployee() {
		
		List<String>list = new ArrayList<String>();
		list.add("Apache");
		list.add("JBoss");
		list.add("GlassFish");
		list.add("IBM Webshepher");
		list.add("Oracle");
		
		return list;
	}

}
