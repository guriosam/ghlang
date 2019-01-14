package dsl_objects;

import endpoints.RepositoryAPI;
import interfaces.GHType;
import interfaces.GHTypeAPI;

public class Repository implements GHTypeAPI, GHType{

	public GHString repo_name;
	public Commits commit_list;
	public Issues issue_ist;
	public PullRequests pull_request_list;

	public Int id;
	public GHString name;
	public GHString full_name;
	public User owner;
	public Bool private_repo;
	public GHString html_url;
	public GHString description;
	public Bool fork;
	public GHString language;
	public Int forks_count;
	public Int stars_count;
	public Int watchers_count;
	public GHString default_branch;
	public Int open_issues_count;
	public GHDate pushed_at;
	public GHDate created_at;
	public GHDate updated_at;
	public Int subscribers_count;
	public Int network_count;

	public Repository(String repoName) {
		this.repo_name.string = repoName;
		this.commit_list = new Commits();
		this.issue_ist = new Issues();
		this.pull_request_list = new PullRequests();
	}
		
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
