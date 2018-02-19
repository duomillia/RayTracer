package abstracts;

import java.awt.Color;

import Surfaces.Surface;
import Utils.MathUtils;
import Utils.Vector3;
import nodeTree.Intersectable;
import nodeTree.Positionable;
import nodeTree.Ray;
import nodeTree.Visible;

public class AbstractSphere extends Visible {

	float radius = 0;
	public AbstractSphere()
	{
		
	};
	
	public AbstractSphere(int x, int y, int z, int r) {
		
		this.getCentre().setX(x);
		this.getCentre().setY(y);
		this.getCentre().setZ(z);

		this.setRadius(r);
		
		
	}
	
	/**
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}

	/*
	 * https://www.scratchapixel.com/lessons/3d-basic-rendering/minimal-ray-tracer
	 * -rendering-simple-shapes/ray-sphere-intersection
	 */
	@Override
	public Vector3 getNearestIntersectionToOrigin(Ray ray) {

		Vector3 l = this.getCentre().difference(ray.getCentre());
		double a = Vector3.ScalarProduct(this.getDirection(),
				this.getDirection());
		double b = 2 * Vector3.ScalarProduct(l, l);
		double c = Vector3.ScalarProduct(l, l) - this.getRadius()
				* this.getRadius();

		Double d = MathUtils.getQuadraticSolution(a, b, c);
		
		if (d == null || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY) {
			return null;
		}

		Vector3 nearestPoint = null;

		{
			for (Positionable p : this.getChildren()) {
				{
					Vector3 p2 = ((Intersectable) this)
							.getNearestIntersectionToOrigin(ray);

					if (p2 != null && p2.distanceFrom(ray.getCentre()) < nearestPoint
							.distanceFrom(ray.getCentre())) {
						nearestPoint = p2;
						
					}

				}

				;
			}

		}
		
		if (nearestPoint != null) {
			System.out.println ("A Hit! " + nearestPoint.toString());
			ray.addColor (this.getSurface().getColor());
		}
		return nearestPoint;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = super.toString() + "\nSphere [radius="
				+ getRadius()
				+ ", "
				+ (getName() != null ? "name=" + getName() + ", " : "")
				+ "getRadius()="
				+ getRadius()
				+ ", "
				+ (getSurface() != null ? "getSurface()=" + getSurface() + ", "
						: "")
				+ "isVisible()="
				+ isVisible()
				+ ", "
				+ (getCentre() != null ? "getCentre()=" + getCentre() + ", "
						: "")
				+ (getDirection() != null ? "getDirection()=" + getDirection()
						+ ", " : "")
				+ (getFocus() != null ? "getFocus()=" + getFocus() + ", " : "")
				+ "getName_count()="
				+ getName_count()
				+ ", "
				+ (getId_number() != null ? "getId_number()=" + getId_number()
						+ ", " : "")
				+ (getName() != null ? "getName()=" + getName() + ", " : "")
				+ (getClass() != null ? "getClass()=" + getClass() + ", " : "")
				+ "hashCode()="
				+ hashCode()
				+ ", " + "]";
		
		return s;
	}

}