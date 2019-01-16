package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class PullRequests implements GHList, GHType{

public List<PullRequest> elements;
	
	public PullRequests(){
		this.elements = new ArrayList<>();
	}

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof PullRequest) {
			elements.add((PullRequest) obj);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof PullRequest) {
			if (elements.contains(obj)) {
				elements.remove((PullRequest) obj);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof PullRequest) {
			return elements.contains(obj);
		}

		return false;
	}

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}
	
	@Override
	public GHType get(int position) {
		if (elements.size() > position) {
			return elements.get(position);
		} else {
			return new PullRequest();
		}
	}

	@Override
	public boolean put(int index, GHType element) {
		if (element instanceof PullRequest) {
			elements.add(index, (PullRequest) element);
			return true;
		}

		return false;

	}

	
	
	@Override
	public String toString() {
		return "PullRequests [pullrequests=" + elements + "]";
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}
	
	
}
