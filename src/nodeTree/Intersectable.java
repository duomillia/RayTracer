package nodeTree;

import Utils.Vector3;

public abstract class Intersectable extends Positionable {
	
	public abstract Vector3 getNearestIntersectionToOrigin(Ray ray);
	
}
