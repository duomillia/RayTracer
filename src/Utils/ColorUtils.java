package Utils;

import java.awt.Color;

public class ColorUtils {
	/*
	 * Ref
	 * http://www.java2s.com/Code/Java/2D-Graphics-GUI/Blendtwocolors.htm
	 * */
	public static Color blend(Color a, Color b)
	{
		return new Color (
				(a.getRed() + b.getRed()) / 2,
				(a.getGreen() + b.getGreen()) / 2,
				(a.getBlue() + b.getBlue()) / 2
				
				
				);
		
		
	}

}
