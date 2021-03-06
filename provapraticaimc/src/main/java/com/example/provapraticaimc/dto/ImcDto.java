package com.example.provapraticaimc.dto;

import java.util.List;

public class ImcDto {
     private double peso;
     private String imc;
    public ImcDto(List<String> pesoaltura) {
    	double pesokg = Double.parseDouble(pesoaltura.get(0));
    	double altura = Double.parseDouble(pesoaltura.get(1));
    	this.peso =  pesokg;
    	double pesoimc = this.peso/(altura * altura);
		if (pesoimc < 18.5) {
			this.imc = "Abaixo do Peso";
		}
		else if (pesoimc >= 18.5 && pesoimc <= 24.99) {
			 this.imc = "Peso Ideal";
		}
		else if (pesoimc >= 25.0 && pesoimc <= 29.99) {
			 this.imc = "Excesso de Peso";
		}
		else if (pesoimc >= 30.0 && pesoimc <= 34.99) {
			 this.imc = "Obesidade Grau 1";
		}
		else if (pesoimc >= 35.0 && pesoimc <= 39.99) {
			 this.imc = "Obesidade Grau 2";
		}
		else if (pesoimc >= 40) {
			 this.imc = "Obesidade Grau 3";
		}
    }
	public double getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getImc() {
		return imc;
	}
	public void setImc(String imc) {
		this.imc = imc;
	}
}
