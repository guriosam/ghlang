package dsl_objects;

import endpoints.CommentsAPI;
import generators.Comments;
import interfaces.GHType;
import interfaces.GHTypeAPI;

public class Comment implements GHType, GHTypeAPI {

	public GHString id = new GHString();
	public GHString html_url = new GHString();
	public GHString body = new GHString();
	public User user = new User();
	public GHDate created_at = new GHDate();
	public GHDate updated_at = new GHDate();

	@Override
	public boolean compare(GHType obj1) {
		return obj1.toString().equals(this.toString());
	}

	public Comment collectData(String path, String url, String issueNumber, String commentNumber) {
		String filePath = CommentsAPI.collectCommentInIssue(path, url, issueNumber, commentNumber);

		String project = url.substring(url.indexOf("/") + 1);

		if (!filePath.equals("")) {
			Comment c = Comments.readSingleComment(filePath, project);
			id = c.id;
			html_url = c.html_url;
			body = c.body;
			user = c.user;
			created_at = c.created_at;
			updated_at = c.updated_at;
		}
		
		return this;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id +",\n html_url=" + html_url +",\n body=" + body +",\n user=" + user +",\n created_at="
				+ created_at +",\n updated_at=" + updated_at + "]";
	}
	
	

}
