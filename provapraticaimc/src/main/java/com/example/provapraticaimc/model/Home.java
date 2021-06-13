package com.example.provapraticaimc.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
	@RequestMapping("/")
	@ResponseBody
	public String Hello() {
		return "Digite /imc?peso=**** para achar o imc";
	}

}
