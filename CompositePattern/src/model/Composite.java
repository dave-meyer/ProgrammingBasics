package model;

import java.util.ArrayList;

public abstract class Composite extends Component {

	ArrayList<Component> children;
	
	double multiplikator;
	
	public Composite() {
		this.multiplikator = 1.0f;
		children = new ArrayList<Component>();
	}
	
	@Override
	public float getCosts() {
		float costs = 0.0f;
		for(int i = 0; i < getChildren().size(); i++) {
			costs += getChildren().get(i).getCosts();
		}
		costs *= multiplikator;
		return costs;
	}
	
	@Override
	public void operation() {
		for(int i = 0; i < getChildren().size(); i++) {
			getChildren().get(i).operation();
		}
	}
	
	@Override
	public String getStructure(int layer) {
		String structure = this.toString()+"\n";
		for(int i = 0; i < getChildren().size(); i++) {
			for(int j = 0; j < layer; j++) {
				structure += "\t";
			}
			structure += "\t";
			structure += (i+1)+") ";
			structure += getChildren().get(i).getStructure(layer+1);
			if(i < getChildren().size()-1) structure += "\n";
		}
		return structure;
	}
	
	
	public void add(Component c) {
		getChildren().add(c);
	}
	
	public void remove(Component c) {
		getChildren().remove(c);
	}

	public ArrayList<Component> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Component> children) {
		this.children = children;
	}

	public double getMultiplikator() {
		return multiplikator;
	}

	protected void setMultiplikator(double multiplikator) {
		this.multiplikator = multiplikator;
	}
	
	@Override
	public String toString() {
		return super.toString()+" (x"+getMultiplikator()+")";
	}
}