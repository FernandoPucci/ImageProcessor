package br.eletro.model;

public class ItemRGB {

	private String label;
	private int valor;

	public ItemRGB(String label, int valor){
		
		this.label = label;
		this.valor = valor;
		
	}
	
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[").append(label).append(", ")
				.append(valor).append("]");
		return builder.toString();
	}
	
	

}
