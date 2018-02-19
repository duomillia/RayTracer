package raytracer2018;

import camera.Camera;
import nodeTree.Node;
import nodeTree.Container;
import nodeTree.Sphere;

public class RayTracer {

	Container root = new Container(0,0,0,100);

	public Container load(String string) {

		root.add(new Sphere(0, 0, 0, 3));
		root.add(new Camera(5, 5, 0, 10, 10, 0));
		
		return root;
		
	}

	public Camera getCamera(int i) {

		for (Node shape : root.getChildren()) {
			if (shape.getClass().equals(Camera.class)) {
				return (Camera) shape;
			}
		}

		return null;
	}
}
