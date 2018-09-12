package Surfaces;

import java.awt.Color;

public class Surface {

	private Color color;

	public Surface(Color c) {
		this.color = c;
	}

	public Color getColor() {
		if (this.color == null) {
			this.setColor(new Color(0, 0, 0));
		}
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
