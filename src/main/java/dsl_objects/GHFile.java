package dsl_objects;

import interfaces.GHType;

public class GHFile implements GHType{
	
	public GHString filename;
	public Int additions;
	public Int deletions;
	public GHString status;
	public GHString patch;
	
	@Override
	public boolean compare(GHType obj1) {
		// TODO Auto-generated method stub
		return obj1.toString().equals(this.toString());
	}
	
}
