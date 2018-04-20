package model;

public abstract class Component {

	float costs;

	String name;
	
	public float getCosts() {
		return costs;
	}

	protected void setCosts(float costs) {
		this.costs = costs;
	}

	public abstract String getStructure(int layer);

	public String getStructure() {
		return getStructure(0);
	}
	
	public abstract void operation();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return this.getName() + " " + this.getCosts()+"€";
	}
}
