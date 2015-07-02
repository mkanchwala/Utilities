package com.mkanchwala.thumbs.main;

import java.io.File;
import java.io.IOException;

import net.coobird.thumbnailator.Thumbnails;

public class ThumbnailatorApp {
	public static void main(String[] args) throws IOException {
		Thumbnails.of(new File("src/main/resources/").listFiles())
        .size(640, 480)
        .outputFormat("jpg")
        .toFile("src/main/resources/thumb1");
	}
}
