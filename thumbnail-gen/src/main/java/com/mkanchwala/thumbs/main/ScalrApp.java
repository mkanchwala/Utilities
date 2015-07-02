package com.mkanchwala.thumbs.main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;

public class ScalrApp {
	public static void main(String[] args) throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/doctor.jpg"));
		BufferedImage thumbnail = Scalr.resize(image, Scalr.Method.SPEED, Scalr.Mode.FIT_TO_WIDTH, 640, 480, Scalr.OP_ANTIALIAS);

		ImageIO.write(thumbnail, "jpg", new File("src/main/resources/thumb2.jpg"));

	}
}