package com.example.provapraticaimc.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
	@RequestMapping("/")
	@ResponseBody
	public String Hello() {
		return "Digite /imc?pesoaltura=****,**** sendo o primeiro (****) o peso e depois da (,) digite a altura no lugar dos (****) , para achar o imc";
	}

}
