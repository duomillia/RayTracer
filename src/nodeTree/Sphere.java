package nodeTree;

import java.awt.Color;

import Surfaces.Surface;
import abstracts.AbstractSphere;

public class Sphere extends AbstractSphere {
	
	public Sphere(float x, float y, float z, float r) {

		this();
		this.setRadius(r);
		this.setSurface(new Surface(Color.BLUE));
		
		
	}

	public Sphere() {
		this.setName("SPHERE");
	}

	
	
	
}
