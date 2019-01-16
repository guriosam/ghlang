package temp;
import java.util.List;
import java.util.ArrayList;
import dsl_objects.Bool;
import dsl_objects.Bools;
import dsl_objects.Comment;
import dsl_objects.Comments;
import dsl_objects.Commit;
import dsl_objects.Commits;
import dsl_objects.GHDate;
import dsl_objects.Dates;
import dsl_objects.GHFile;
import dsl_objects.Files;
import dsl_objects.GHFloat;
import dsl_objects.Floats;
import dsl_objects.Int;
import dsl_objects.Ints;
import dsl_objects.Issue;
import dsl_objects.Issues;
import dsl_objects.PullRequest;
import dsl_objects.PullRequest;
import dsl_objects.Repository;
import dsl_objects.Repositories;
import dsl_objects.GHString;
import dsl_objects.Strings;
import dsl_objects.User;
import dsl_objects.Users;

public class GHCode {

	public static void main(String[] args){

	Comment first_comment = new Comment();
	first_comment = first_comment.collectData(args[0], "google/material-design-icons","1","59602805");

	System.out.println(first_comment.body);

	Commit commit1 = new Commit();
	commit1 = commit1.collectData(args[0], "google/material-design-icons","e24770a0300367966b3440d72013816adf98e79f");

	System.out.println(commit1);

	}

}