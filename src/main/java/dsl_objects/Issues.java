package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Issues implements GHList, GHType{

	public List<Issue> issues;
	
	public Issues(){
		this.issues = new ArrayList<>();
	}
	
	@Override
	public int size() {
		return issues.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof Issue) {
			issues.add((Issue) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof Issue) {
			if (issues.contains(obj)) {
				issues.remove((Issue) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Issue) {
			return issues.contains(obj);
		}

		return false;
	}

	public List<Issue> sortAsc(String field) {

		// TODO Check field and sort

		return issues;
	}

	public List<Issue> sortDesc(String field) {

		// TODO Check field and sort

		return issues;
	}
	
	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

}
