package dsl_objects;

import interfaces.GHType;

public class GHDate implements GHType{
	
	public GHString day = new GHString();
	public GHString month = new GHString();
	public GHString year = new GHString();
	public GHString hour = new GHString();
	public GHString minute = new GHString();
	public GHString second = new GHString();
	public GHString full_date = new GHString();
	
	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public String toString() {
		return "GHDate [day=" + day + ", month=" + month + ", year=" + year + ", hour=" + hour + ", minute=" + minute
				+ ", second=" + second + ", full_date=" + full_date + "]";
	}
	
	

}
