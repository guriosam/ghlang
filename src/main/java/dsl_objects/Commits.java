package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Commits implements GHList, GHType {

	public List<Commit> commits;

	public Commits() {
		this.commits = new ArrayList<>();
	}

	@Override
	public int size() {
		return commits.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof Commits) {
			commits.add((Commit) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof Commits) {
			if (commits.contains(obj)) {
				commits.remove((Commit) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Commit) {
			return commits.contains(obj);
		}

		return false;
	}

	public List<Commit> sortAsc(String field) {

		// TODO Check field and sort

		return commits;
	}

	public List<Commit> sortDesc(String field) {

		// TODO Check field and sort

		return commits;
	}

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}
}
