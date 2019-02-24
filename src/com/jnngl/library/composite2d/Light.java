package com.jnngl.library.composite2d;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;

public class Light {
	
	public void drawAngleLight(Graphics g, int x, int y, int radius, int luminosity) {
		//Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		
		// center of image
		Point2D center = new Point2D.Float(radius, radius);
		 
		// focus of radial gradient (centered)
		Point2D focus = new Point2D.Float(radius, radius);
		// optionally set the focus to a side (instead of the center) to give direction
		//focus.setLocation(Math.cos(angle) * 3 * radius / 4 + radius, Math.sin(angle) * 3 * radius / 4 + radius);
		 
		// colors
		float[] dist = {0f, 1f};
		Color[] colors = {new Color(0, 0, 0, 0), new Color(0, 0, 0, luminosity)};
		 
		// set the paint
		RadialGradientPaint rgp = new RadialGradientPaint(center, radius, focus, dist, colors, MultipleGradientPaint.CycleMethod.NO_CYCLE);
		g2d.setPaint(rgp);
		 
		// draw light
		for(int i = 0; i < radius; i++) {
			g.setColor(new Color(0, 0, 0, 1));
			g2d.fillOval(x, y, i + radius, i + radius);
		}
	}
	
	public void drawDirectionalLight(Graphics g, int x, int y, int radius, int luminosity) {
		//Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		
		// center of image
		Point2D center = new Point2D.Float(radius, radius);
		 
		// focus of radial gradient (centered)
		Point2D focus = new Point2D.Float(radius, radius);
		// optionally set the focus to a side (instead of the center) to give direction
		//focus.setLocation(Math.cos(angle) * 3 * radius / 4 + radius, Math.sin(angle) * 3 * radius / 4 + radius);
		 
		// colors
		float[] dist = {0f, 1f};
		Color[] colors = {new Color(0, 0, 0, 0), new Color(0, 0, 0, luminosity)};
		 
		// set the paint
		RadialGradientPaint rgp = new RadialGradientPaint(center, radius, focus, dist, colors, MultipleGradientPaint.CycleMethod.NO_CYCLE);
		g2d.setPaint(rgp);
		 
		// draw light
		for(int i = 0; i < radius; i++) {
			g.setColor(new Color(0, 0, 0, 1));
			g2d.fillOval(x + i, y + i, i + radius, i + radius);
		}
	}
	
	public void drawLight(Graphics g, int x, int y, int radius, int luminosity) {
		//Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		
		// center of image
		Point2D center = new Point2D.Float(radius, radius);
		 
		// focus of radial gradient (centered)
		Point2D focus = new Point2D.Float(radius, radius);
		// optionally set the focus to a side (instead of the center) to give direction
		//focus.setLocation(Math.cos(angle) * 3 * radius / 4 + radius, Math.sin(angle) * 3 * radius / 4 + radius);
		 
		// colors
		float[] dist = {0f, 1f};
		Color[] colors = {new Color(0, 0, 0, 0), new Color(0, 0, 0, luminosity)};
		 
		// set the paint
		RadialGradientPaint rgp = new RadialGradientPaint(center, radius, focus, dist, colors, MultipleGradientPaint.CycleMethod.NO_CYCLE);
		g2d.setPaint(rgp);
		 
		// draw light
		for(int i = 0; i < radius; i++) {
			g.setColor(new Color(0, 0, 0, 1));
			g2d.fillOval(x - (i / 2), y - (i / 2), i + radius, i + radius);
		}
	}
	
}
