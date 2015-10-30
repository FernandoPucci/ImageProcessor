package br.eletro.test;

import java.awt.Color;
import java.awt.image.BufferedImage;

import br.eletro.model.ItemRGB;
import br.eletro.model.VectorRGB;
import br.eletro.util.Constantes;
import br.eletro.util.FileUtils;

public class Tester {

	private static final String NOME_ARQUIVO1 = "IMG_20151030_08hhhhhhhh0238352.jpg";
//	private static final String NOME_ARQUIVO2 = "azul.jpg";
//	private static final String NOME_ARQUIVO3 = "verde.jpg";

	public static void main(String[] args) {

		try {

			byte[] arquivo1 = FileUtils
					.abreArquivoImagem(Constantes.CAMINHO_ARQUIVO
							+ NOME_ARQUIVO1);
			BufferedImage image1 = FileUtils.converteBufferedImage(arquivo1);

//			byte[] arquivo2 = FileUtils
//					.abreArquivoImagem(Constantes.CAMINHO_ARQUIVO
//							+ NOME_ARQUIVO2);
//			BufferedImage image2 = FileUtils.converteBufferedImage(arquivo2);
//
//			byte[] arquivo3 = FileUtils
//					.abreArquivoImagem(Constantes.CAMINHO_ARQUIVO
//							+ NOME_ARQUIVO3);
//			BufferedImage image3 = FileUtils.converteBufferedImage(arquivo3);

			exibeDadosImagem(image1, "Laranja");
//			exibeDadosImagem(image2, "Azul");
//			exibeDadosImagem(image3, "Verde");

			testaVermelho();
			testaLaranja();
			
		} catch (Exception ex) {

			System.out.println(ex.getMessage());
			ex.printStackTrace();

		}

	}

private static void testaLaranja(){
		
		Color c = Color.ORANGE;
		
	VectorRGB vetor = new VectorRGB(c.getRed(), c.getGreen(), c.getBlue());
		
		System.out.println(vetor.toString());
		System.out.println(vetor.checaMaxColorVetor().toString());
		
	}
	
	private static void testaVermelho(){
		
		Color c = Color.RED;
		
	VectorRGB vetor = new VectorRGB(c.getRed(), c.getGreen(), c.getBlue());
		
		System.out.println(vetor.toString());
		System.out.println(vetor.checaMaxColorVetor().toString());
		
	}

	private static void exibeDadosImagem(BufferedImage image, String texto) {

		System.out.println(texto);

		Color c = new Color(image.getRGB(320, 240));
		System.out.println("Largura: " + image.getWidth() + ", Altura: "
				+ image.getHeight());
		
		VectorRGB vetor = new VectorRGB(c.getRed(), c.getGreen(), c.getBlue());
		
		System.out.println(vetor.toString());
		System.out.println(vetor.checaMaxColorVetor().toString());

	}

}
