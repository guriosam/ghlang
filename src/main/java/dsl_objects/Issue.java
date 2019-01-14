package dsl_objects;

import interfaces.GHType;
import interfaces.GHTypeAPI;

public class Issue implements GHType, GHTypeAPI {

	public Int id;
	public GHString html_url;
	public Int number;
	public GHString state;
	public GHString title;
	public GHString body;
	public User user;
	public User assignee;
	public Users assignees;
	public Int comments;
	public Labels labels;
	public Bool pull_request;
	public GHDate close_at;
	public GHDate created_at;
	public GHDate updated_at;
	public User closed_by;

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public void collectData(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
