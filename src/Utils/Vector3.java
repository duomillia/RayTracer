package Utils;

import nodeTree.Ray;

/**
 * 
 * @author ian@ianwheeler.ca
 *
 */
public class Vector3 {
	public static final Double INFINITY = Double.MAX_VALUE;
	
	private double x;
	private double y;
	private double z;

	public Vector3() {
	}

	public Vector3(double i, double j, double k) {
		this.x = i;
		this.y = j;
		this.z = k;
		
		//this.normalise();
	}

	public Vector3(Double v) {
		this.x = this.y = this.z = INFINITY;
	}

	public void normalise()
	{
		double l = this.getLength();
		if (l != 0)
		{
			this.x /= l;
			this.y /= l;
			this.z /= l;
			
		}
		
	}
	
	public Vector3 difference(Vector3 v)
	{
		return new Vector3 (this.x - v.x, this.y - v.y, this.z - v.z);
		
	}
	
	public static double ScalarProduct(Vector3 a, Vector3 b)
	{
		return (a.getX() *b.getX() +
				a.getY() *b.getY() +
				a.getZ() *b.getZ() 
				);
		
	}
	
	public double getLength()
	{
		return Math.sqrt(this.x*this.x + this.y * this.y + this.z * this.z);
		
		
	}
	
	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}
	

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public Vector3 scale(Double d) {
		
		return new Vector3(this.x * d, this.y * d, this.z * d);
	}

	public double distanceFrom(Vector3 v) {
		return this.difference(v).getLength();
	}

	public Vector3 add(Vector3 v) {
		return new Vector3 (this.x + v.x, this.y + v.y, this.z + v.z);
	}

	
	public String toString()
	{
		return ("x=" + x + " y=" + y + " z=" +z);
		
	}
}