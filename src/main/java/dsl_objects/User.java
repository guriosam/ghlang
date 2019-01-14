package dsl_objects;

import interfaces.GHType;
import interfaces.GHTypeAPI;

public class User implements GHType, GHTypeAPI{
	
	public GHString login;
	public Int id;
	public GHString html_url;
	public GHString type;
	public Bool site_admin;
	public GHString name;
	public GHString company;
	public GHString location;
	public GHString email;
	public GHString bio;
	public Int public_repos;
	public Int followers;
	public Int following;
	public GHDate created_at;
	public GHDate updated_at;
	
	@Override
	public void collectData(String[] args) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public boolean compare(GHType obj1) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
