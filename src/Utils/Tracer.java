package Utils;

import java.awt.Color;

import nodeTree.Intersectable;
import nodeTree.Positionable;
import nodeTree.Ray;

public class Tracer {

	public static Color shootRayGetColor(Ray r, Intersectable i) {

		System.out.println ("Now tracing: " + i.getName());
		i.getNearestIntersectionToOrigin(r);
		
		return r.getColor();
	}

}
