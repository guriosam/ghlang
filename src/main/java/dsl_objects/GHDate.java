package dsl_objects;

import interfaces.GHType;

public class GHDate implements GHType{
	
	public GHString day;
	public GHString month;
	public GHString year;
	public GHString hour;
	public GHString minute;
	public GHString second;
	public GHString full_date;
	
	@Override
	public boolean compare(GHType obj1) {
		// TODO Auto-generated method stub
		return false;
	}

}
