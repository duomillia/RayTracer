package nodeTree;

import java.util.ArrayList;

public class Node extends Nameable {

	protected ArrayList<Positionable> children = new ArrayList<Positionable>();

	public Node() {
		super();
	}

	/**
	 * @return the children
	 */
	public ArrayList<Positionable> getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(ArrayList<Positionable> children) {
		this.children = children;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = "\nNode ["
				+ (getName() != null ? "getName()=" + getName() : "") + "]";
		s += "\n children : " + this.getChildren().size() + "; \n";
		for (Node n : this.getChildren()) {
			s += "\n\n\n  <\t" + n.toString() + ">";
		}

		return s;
	}

}