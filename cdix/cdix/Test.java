package com.yash.cdix;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.yash.cdix.StandardOutView;

public class Test {

	public static void main(String[] args) {
		WeldContainer container = new Weld().initialize();

		StandardOutView outView = container.instance().select(StandardOutView.class).get();
		outView.showAllEmployee();
		
	}
}
