package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class PullRequests implements GHList, GHType{

public List<PullRequest> pullrequests;
	
	public PullRequests(){
		this.pullrequests = new ArrayList<>();
	}

	@Override
	public int size() {
		return pullrequests.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof PullRequest) {
			pullrequests.add((PullRequest) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof PullRequest) {
			if (pullrequests.contains(obj)) {
				pullrequests.remove((PullRequest) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof PullRequest) {
			return pullrequests.contains(obj);
		}

		return false;
	}

	public List<PullRequest> sortAsc(String field) {

		// TODO Check field and sort

		return pullrequests;
	}

	public List<PullRequest> sortDesc(String field) {

		// TODO Check field and sort

		return pullrequests;
	}
	
	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}
	
	
}
