package camera;

import java.awt.Color;
import java.awt.image.BufferedImage;

import nodeTree.Intersectable;
import nodeTree.Positionable;
import nodeTree.Ray;
import Utils.Tracer;
import Utils.Vector3;

public class Camera extends Positionable {

	private int width = 64;
	private int height = 48;

	private int world_height = 6;
	private int world_width =  4;
	
	private Vector3 eye = new Vector3();
	
	public Camera()
	{
		this.setName("Camera");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Camera [width=" + width + ", height=" + height
				+ ", world_height=" + world_height + ", world_width="
				+ world_width + ", " + (eye != null ? "eye=" + eye + ", " : "")
				+ (getName() != null ? "name=" + getName() : "") + "]";
	}

	public Camera(int x, int y, int z, int i, int j, int k) {
		this();
		
		this.getCentre().setX(x);
		this.getCentre().setY(y);
		this.getCentre().setZ(z);
		
		this.getEye().setX(i);
		this.getEye().setY(j);
		this.getEye().setZ(k);
		

	}


	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}


	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}


	/**
	 * @return the world_height
	 */
	public int getWorld_height() {
		return world_height;
	}


	/**
	 * @param world_height the world_height to set
	 */
	public void setWorld_height(int world_height) {
		this.world_height = world_height;
	}


	/**
	 * @return the world_width
	 */
	public int getWorld_width() {
		return world_width;
	}


	/**
	 * @param world_width the world_width to set
	 */
	public void setWorld_width(int world_width) {
		this.world_width = world_width;
	}




	/**
	 * @return the eye
	 */
	public Vector3 getEye() {
		return eye;
	}


	/**
	 * @param eye the eye to set
	 */
	public void setEye(Vector3 eye) {
		this.eye = eye;
	}


	public BufferedImage render(Intersectable root) {
		System.out.println("Rendering from Camera " + this.getName() + "; h="
				+ this.getHeight() + ", w=" + this.getWidth());

		BufferedImage image = new BufferedImage(this.getWidth(),
				this.getHeight(), BufferedImage.TYPE_INT_RGB);

		Color c = Color.WHITE;
		
		for (int i = 0; i < this.getWidth(); i++) {
			for (int j = 0; j < this.getHeight(); j++) {
				
				Vector3 direction = new Vector3();			
				
				// Move the direction of the ray to point through i,j on the screen
				direction.setX((world_width / 2) + i * (world_width/width));
				direction.setY((world_height / 2) + i * (world_height/height));
				
				
				
				Ray r = new Ray(this.getCentre(), direction);
				r.setColor(Color.WHITE);
				
				System.out.println ("\n\n\nNow shooting ray for pixels " + i + ", " + j);
				c = Tracer.shootRayGetColor(r, root);
				System.out.println ("c is now" + c.toString());
				image.setRGB(i, j, c.getRGB());

			}

		}

		return image;
	}



}
