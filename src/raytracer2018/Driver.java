package raytracer2018;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Utils.MathUtils;
import Utils.Vector3;
import nodeTree.Container;
import nodeTree.Ray;
import nodeTree.Sphere;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println(MathUtils.getQuadraticSolution(1d, 5d, 5d));
		
		//Sphere s = new Sphere(0,0,0,100);
		//Ray r = new Ray(new Vector3(101,0,0), new Vector3(-1,0,0));
		
		//System.out.println (s.getNearestIntersectionToOrigin(r));
		
		
//		RayTracer rt = new RayTracer();
//	
//		Container c = rt.load("sample.xml");
//		
//		System.out.println((c.toString()));
//		
//		BufferedImage bi = rt.getCamera(1).render(c);
//		
//		File outputfile = new File("test.png");
//		
//		try {
//			ImageIO.write(bi, "png", outputfile);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	System.out.println("done");
	}

}
