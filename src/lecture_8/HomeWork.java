package lecture_8;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HomeWork {

	public static void main(String[] args) throws IOException {
		BufferedImage in = ImageIO.read(new File("/home/sasha/3244317.jpg"));
		int h = in.getHeight();
		int w = in.getWidth();
		int r = 15;
		BufferedImage out = new BufferedImage(w, h, in.getType());
		for(int y = 0; y < h; y++) 
			for(int x = 0; x < w; x++) {
		
		
		
			}
	}

}
