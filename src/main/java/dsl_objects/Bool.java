package dsl_objects;

import interfaces.GHType;

public class Bool implements GHType {

	public boolean bool;
	
	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public String toString() {
		return "Bool [bool=" + bool + "]";
	}

}
