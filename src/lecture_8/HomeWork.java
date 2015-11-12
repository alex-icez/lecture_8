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
		

	}

}
