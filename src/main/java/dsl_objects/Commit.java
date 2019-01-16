package dsl_objects;

import endpoints.CommitsAPI;
import generators.Commits;
import interfaces.GHType;
import interfaces.GHTypeAPI;

public class Commit implements GHType, GHTypeAPI {

	public GHString sha = new GHString();
	public GHString html_url = new GHString();
	public GHString author_name = new GHString();
	public GHString author_login = new GHString();
	public GHString author_email = new GHString();
	public GHString message = new GHString();
	public GHDate author_date = new GHDate();
	public GHString committer_name = new GHString();
	public GHString committer_login = new GHString();
	public GHString committer_email = new GHString();
	public GHDate committer_date = new GHDate();
	public Bool author_site_admin = new Bool();
	public Bool committer_site_admin = new Bool();
	public GHFloat additions = new GHFloat();
	public GHFloat deletions = new GHFloat();
	public Files files = new Files();

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	public Commit collectData(String path, String url, String commitSHA) {

		String filePath = CommitsAPI.collectSingleCommit(path, url, commitSHA);

		String project = url.substring(url.indexOf("/") + 1);

		if (!filePath.equals("")) {
			Commit c = Commits.readSingleCommit(filePath, project);

			sha = c.sha;
			html_url = c.html_url;
			
			author_name = c.author_name;
			author_login = c.author_login;
			author_date = c.author_date;
			author_email = c.author_email;
			author_site_admin = c.author_site_admin;

			committer_name = c.committer_name;
			committer_login = c.committer_login;
			committer_email = c.committer_email;
			committer_date = c.committer_date;
			committer_site_admin = c.committer_site_admin;
			
			additions = c.additions;
			deletions = c.deletions;
			
			message = c.message;
			
			files = c.files;
			
		}

		return this;
	}

	@Override
	public String toString() {
		return "Commit [sha=" + sha +",\n html_url=" + html_url +",\n author_name=" + author_name +",\n author_login="
				+ author_login +",\n author_email=" + author_email +",\n message=" + message +",\n author_date="
				+ author_date +",\n committer_name=" + committer_name +",\n committer_login=" + committer_login
				+",\n committer_email=" + committer_email +",\n commiter_date=" + committer_date +",\n author_site_admin="
				+ author_site_admin +",\n commiter_site_admin=" + committer_site_admin +",\n additions=" + additions
				+",\n deletions=" + deletions +",\n files=" + files + "]";
	}
	
	

}
