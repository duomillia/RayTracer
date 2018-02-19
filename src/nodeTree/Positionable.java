package nodeTree;

import Utils.Vector3;


public class Positionable extends Node {

	private Vector3 centre = new Vector3();
	private Vector3 direction = new Vector3();
	
	private Vector3 focus = new Vector3();
	
	public Positionable() {
		
		
	}
	

	

	public void add (Positionable s)
	
	{
		this.children.add(s);
		
	}

	/**
	 * @return the centre
	 */
	public Vector3 getCentre() {
		return centre;
	}

	/**
	 * @param centre the centre to set
	 */
	public void setCentre(Vector3 centre) {
		this.centre = centre;
	}

	/**
	 * @return the eye
	 */
	public Vector3 getDirection() {
		return direction;
	}

	/**
	 * @param eye the eye to set
	 */
	public void setDirection(Vector3 eye) {
		this.direction = eye;
	}

	/**
	 * @return the focus
	 */
	public Vector3 getFocus() {
		return focus;
	}

	/**
	 * @param focus the focus to set
	 */
	public void setFocus(Vector3 focus) {
		this.focus = focus;
	}

	
	public String toString()
	{
		return super.toString();
	}
}
