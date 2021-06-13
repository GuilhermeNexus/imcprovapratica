package com.example.provapraticaimc.dto;

public class ImcDto {
     private float peso;
     private float imc;
    public ImcDto(float peso) {
    	this.peso = peso;
    }
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}
}
