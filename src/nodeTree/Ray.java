package nodeTree;

import java.awt.Color;

import Utils.ColorUtils;
import Utils.Vector3;

public class Ray extends Positionable {

	/*
	 * These reflect how many times the ray will bounce around before stopping.
	 */
	int total_reflections = 1;
	int reflections_left = 1;

	Vector3 direction = new Vector3();
	Color color = null;
	
	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}


	public Ray(Vector3 centre, Vector3 direction) {
		this.setCentre(centre);
		this.setDirection(direction);
		this.getDirection().normalise();
	}

	
	/**
	 * @return the direction
	 */
	public Vector3 getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(Vector3 direction) {
		this.direction = direction;
	}

	/**
	 * @return the total_reflections
	 */
	public int getTotal_reflections() {
		return total_reflections;
	}

	/**
	 * @param total_reflections
	 *            the total_reflections to set
	 */
	public void setTotal_reflections(int total_reflections) {
		this.total_reflections = total_reflections;
	}

	/**
	 * @return the reflections_left
	 */
	public int getReflections_left() {
		return reflections_left;
	}

	/**
	 * @param reflections_left
	 *            the reflections_left to set
	 */
	public void setReflections_left(int reflections_left) {
		this.reflections_left = reflections_left;
	}

	public boolean isReflectionLeftAndDecrement() {
		if (reflections_left > 0) {
			reflections_left--;
			return true;
		}
		return false;
	}
	
	public Boolean isReflectionLeft()
	{
		return reflections_left > 0;
	}


	public void addColor(Color color) {
		
		this.setColor (ColorUtils.blend(this.getColor(), color));
		
	}


}
