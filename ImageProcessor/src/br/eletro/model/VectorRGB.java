package br.eletro.model;

public class VectorRGB {

	private ItemRGB[] vector;
	
	public VectorRGB(int redValor, int greenValor,int blueValor){
		
		this.vector = new ItemRGB[3]; 
		
		this.vector[0] = new ItemRGB("R", redValor);
		this.vector[1] = new ItemRGB("G", greenValor);
		this.vector[2] = new ItemRGB("B", blueValor);
		
	}
	
	public String testaCorPredominante(){
		
		
		
		
		return null;
		
	}
	
	public  ItemRGB checaMaxColorVetor() {

		int max = 0;
		int indice = 0;

		for (int i = 0; i < this.vector.length; i++) {

			if (this.vector[i].getValor() > max) {
				max = this.vector[i].getValor();
			}

		}

		for (int x = 0; x < this.vector.length; x++) {

			if (this.vector[x].getValor() == max) {

				indice = x;
				
			}

		}
		
		return this.vector[indice]; 

	}
	@Override
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		
		
		
		for (int i = 0; i < this.vector.length; i++) {
			sb.append(this.vector[i].toString());
		}
		
		
		return sb.toString();
		
	}
	
}
