package com.gokul.freshvotes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class DashboardController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String rootView() {
		return "index";
	}

}
