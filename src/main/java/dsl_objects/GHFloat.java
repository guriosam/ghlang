package dsl_objects;

import interfaces.GHType;

public class GHFloat implements GHType{
	
	public double value = 0.0;

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public String toString() {
		return value + "";
	}
	
	

}
