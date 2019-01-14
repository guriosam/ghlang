package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Comments implements GHList, GHType {

	public List<Comment> comments;

	public Comments() {
		this.comments = new ArrayList<>();
	}

	@Override
	public int size() {
		return comments.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof Comment) {
			comments.add((Comment) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof Comment) {
			if (comments.contains(obj)) {
				comments.remove((Comment) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Comment) {
			return comments.contains(obj);
		}

		return false;
	}

	public List<Comment> sortAsc(String field) {

		// TODO Check field and sort

		return comments;
	}

	public List<Comment> sortDesc(String field) {

		// TODO Check field and sort

		return comments;
	}

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public String toString() {
		return "Comments [comments=" + comments + "]";
	}
	
	
}
