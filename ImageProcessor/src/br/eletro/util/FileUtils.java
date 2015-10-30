package br.eletro.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class FileUtils {

	
	public static void gravaArquivoImagem(byte[] arquivo)throws IOException{
		
		BufferedImage image = null;
		        	
        	InputStream in = new ByteArrayInputStream(arquivo);
         
        	image = ImageIO.read(in);
        	
            ImageIO.write(image, "jpg",new File(Constantes.CAMINHO_ARQUIVO_SALVAR+System.currentTimeMillis()));
          
     
    }

	public static BufferedImage converteBufferedImage(byte[] arquivo) throws IOException{
				
		InputStream in = new ByteArrayInputStream(arquivo);
		BufferedImage bImageFromConvert = ImageIO.read(in);

		return bImageFromConvert;
		
	} 
	
	public static byte[] abreArquivoImagem(String path) throws IOException{
		
		byte[] image;
		
		System.out.println(path);
		
		BufferedImage originalImage = ImageIO.read(new File(
				path));

		// convert BufferedImage to byte array
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(originalImage, "jpg", baos);
		baos.flush();
		image = baos.toByteArray();
		baos.close();
		
		return image; 
		
		
		
	}
	
	
	
}
