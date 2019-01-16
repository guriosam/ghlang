package dsl_objects;

import endpoints.RepositoryAPI;
import interfaces.GHType;
import interfaces.GHTypeAPI;
import utils.IO;

public class Repository implements GHTypeAPI, GHType {

	public GHString repo_name = new GHString();
	public Commits commit_list = new Commits();
	public Issues issue_ist = new Issues();
	public PullRequests pull_request_list = new PullRequests();

	public GHString id = new GHString();
	public GHString name = new GHString();
	public GHString full_name = new GHString();
	public User owner = new User();
	public Bool private_repo = new Bool();
	public GHString html_url = new GHString();
	public GHString description = new GHString();
	public Bool fork = new Bool();
	public GHString language = new GHString();
	public Int forks_count = new Int();
	public Int stars_count = new Int();
	public Int watchers_count = new Int();
	public GHString default_branch = new GHString();
	public Int open_issues_count = new Int();
	public GHDate pushed_at = new GHDate();
	public GHDate created_at = new GHDate();
	public GHDate updated_at = new GHDate();
	public Int subscribers_count = new Int();
	public Int network_count = new Int();

	public Repository collectData(String path, String baseUrl) {

		
		
		return this;
	}

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public String toString() {
		return "Repository [repo_name=" + repo_name + ", commit_list=" + commit_list + ", issue_ist=" + issue_ist
				+ ", pull_request_list=" + pull_request_list + ", id=" + id + ", name=" + name + ", full_name="
				+ full_name + ", owner=" + owner + ", private_repo=" + private_repo + ", html_url=" + html_url
				+ ", description=" + description + ", fork=" + fork + ", language=" + language + ", forks_count="
				+ forks_count + ", stars_count=" + stars_count + ", watchers_count=" + watchers_count
				+ ", default_branch=" + default_branch + ", open_issues_count=" + open_issues_count + ", pushed_at="
				+ pushed_at + ", created_at=" + created_at + ", updated_at=" + updated_at + ", subscribers_count="
				+ subscribers_count + ", network_count=" + network_count + "]";
	}
	
	

}
