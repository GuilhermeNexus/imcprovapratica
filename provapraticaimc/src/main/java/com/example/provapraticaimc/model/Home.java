package com.example.provapraticaimc.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Home {
	@RequestMapping("/")
	@ResponseBody
	public String Hello() {
		return "Digite /imc?peso=**** para achar o imc";
	}

}
