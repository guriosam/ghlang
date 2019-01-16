package dsl_objects;

import interfaces.GHType;

public class GHFile implements GHType{
	
	public GHString filename = new GHString();
	public GHFloat additions = new GHFloat();
	public GHFloat deletions = new GHFloat();
	public GHString status = new GHString();
	public GHString patch = new GHString();
	
	@Override
	public boolean compare(GHType obj1) {
		return obj1.toString().equals(this.toString());
	}

	@Override
	public String toString() {
		return "GHFile [filename=" + filename + ", additions=" + additions + ", deletions=" + deletions + ", status="
				+ status + ", patch=" + patch + "]";
	}
	
}
