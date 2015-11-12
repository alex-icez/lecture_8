package lecture_8;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HomeWork {

	public static void main(String[] args) throws IOException {
		BufferedImage in = ImageIO.read(new File("/home/sasha/3244317.jpg"));
		int w = in.getWidth();
		int h = in.getHeight();
		int r = 15;
		BufferedImage out = new BufferedImage(w, h, in.getType());
		int rs, gs, bs;
		int xi, yi;
		for(int y = 0; y < h; y++) 
			for(int x = 0; x < w; x++) {
				rs = gs = bs = 0;
				for(int i = y - r; i <= y + r; i++)
					for(int j = x - r; j <= x + r; j++) {
						xi = i;
						yi = j;
						if (i < 0)
							xi = 0;
						
						
					}
			}
	}

}
