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
		int div = (2 * r + 1) * (2 * r + 1);
		for(int y = 0; y < h; y++) 
			for(int x = 0; x < w; x++) {
				rs = gs = bs = 0;
				for(int i = y - r; i <= y + r; i++) {
					yi = i;
					if (yi < 0)
						yi = 0;
					if (yi >= h)
						yi = h - 1;
					for(int j = x - r; j <= x + r; j++) {
						xi = j;
						if (xi < 0)
							xi = 0;
						if (xi >= w)
							xi = w - 1;
						int rgb = in.getRGB(xi, yi);	
						bs += rgb & 0xFF;
						gs += (rgb >> 8) & 0xFF;
						rs += (rgb >> 16) & 0xFF;
					}
				}
				bs /= div;
				gs /= div;
				rs /= div;
			}
			
	}

}
