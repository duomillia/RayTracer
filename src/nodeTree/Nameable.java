package nodeTree;

public class Nameable {
	private static int name_count = 0;
	
	private String id_number = "";
	
	String name = "";
	
	/**
	 * @return the name_count
	 */
	public int getName_count() {
		return name_count;
	}
	
	/**
	 * @return the id_number
	 */
	public String getId_number() {
		return id_number;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name + "_" + name_count++;
	}
	
	
	
	

}
