package dsl_objects;

import interfaces.GHType;
import interfaces.GHTypeAPI;

public class Commit implements GHType, GHTypeAPI {

	public GHString sha;
	public GHString author_name;
	public GHString author_login;
	public GHDate author_date;
	public GHString commiter_name;
	public GHString commiter_login;
	public GHString commiter_email;
	public GHDate commiter_date;
	public Bool site_admin;
	public Int additions;
	public Int deletions;
	public Files files;

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public void collectData(String[] args) {
	}


}
