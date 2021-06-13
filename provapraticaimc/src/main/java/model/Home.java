package model;

public class Home {
	@RequestMapping("/")
	@ResponseBody
	public String Hello() {
		return "Digite /imc?peso=**** para achar o imc";
	}

}
