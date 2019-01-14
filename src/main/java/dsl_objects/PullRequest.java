package dsl_objects;

import interfaces.GHType;
import interfaces.GHTypeAPI;

public class PullRequest implements GHTypeAPI, GHType{
	
	public Int id;
	public GHString html_url;
	public Int number;
	public GHString state;
	public GHString title;
	public GHString body;
	public User user;
	public User assignee;
	public Users assignees;
	public Users requested_reviewers;
	public Bool merged;
	public Int comments;
	public Int review_comments;
	public Int commits;
	public Int additions;
	public Int deletions;
	public Int changed_files;
	public Labels labels;
	public GHDate close_at;
	public GHDate created_at;
	public GHDate updated_at;
	public GHDate merged_at;
	public GHString merge_commit_sha;
	public User merged_by;

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public void collectData(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

	