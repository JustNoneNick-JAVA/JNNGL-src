package com.jnngl.library.generator.noise;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import com.jnngl.library.images.ImageLoader;

public class NoiseGenerator {
	
	Random r;
	
	public BufferedImage generateNoise() throws IOException {
		r = new Random();
		BufferedImage noise = null;
		int i = r.nextInt(4);
		System.out.println(i);
		if(i == 0) {
			noise = (BufferedImage) ImageLoader.loadImageFromUrlAndGet(""
					+ "https://upload.wikimedia.org/"
					+ "wikipedia/commons/5/57/Heightmap.png");
		}
		if(i == 1) {
			noise = (BufferedImage) ImageLoader.loadImageFromUrlAndGet(
					"https://i.pinimg.com/"
					+ "originals"
					+ "/f1/f0/82/f1f082b5cbc82424fc38aa2ba99efedd.png");
		}
		if(i == 2) {
			noise = (BufferedImage) ImageLoader.loadImageFromUrlAndGet(
					"http://deusxl.free.fr/HeightmapProblem/terrain-heightmap.JPG"
			);
		}
		if(i == 3) {
			noise = (BufferedImage) ImageLoader.loadImageFromUrlAndGet(
					"https://www.rigsofrods.org/old-forum/"
					+ "forums/120-Mod-tech/44811/attachment-image-000.png"
			);
		}
		if(i == 4) {
			noise = (BufferedImage) ImageLoader.loadImageFromUrlAndGet(
					"http://libnoise.sourceforge.net"
					+ "/tutorials/images/firstheightmap.jpg"
			);
		}
		
		return noise;
	}
	
}
