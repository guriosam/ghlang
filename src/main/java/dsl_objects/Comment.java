package dsl_objects;

import interfaces.GHType;
import interfaces.GHTypeAPI;

public class Comment implements GHType, GHTypeAPI {

	public Int id;
	public GHString html_url;
	public GHString body;
	public User user;
	public GHDate created_at;
	public GHDate update_at;

	@Override
	public boolean compare(GHType obj1) {

		return obj1.toString().equals(this.toString());
	}

	@Override
	public void collectData(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
