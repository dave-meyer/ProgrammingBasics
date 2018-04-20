package model;

public abstract class Leaf extends Component {

	@Override
	public abstract void operation();
	
	@Override
	public String getStructure(int layer) {
		return toString();
	}


}
