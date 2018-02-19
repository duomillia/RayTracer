package nodeTree;

import Surfaces.Surface;

public abstract class Visible extends Intersectable {

	private Surface surface;
	private boolean isVisible;
	
	
	
	/**
	 * @return the surface
	 */
	public Surface getSurface() {
		return surface;
	}

	/**
	 * @param surface the surface to set
	 */
	public void setSurface(Surface surface) {
		this.surface = surface;
	}

	/**
	 * @return the isVisible
	 */
	public boolean isVisible() {
		return isVisible;
	}

	/**
	 * @param isVisible the isVisible to set
	 */
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
}
