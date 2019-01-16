package dsl_objects;

import interfaces.GHType;

public class Int implements GHType{
	
	public long value = 0;

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public String toString() {
		return value + "";
	}
	
	
	

}
