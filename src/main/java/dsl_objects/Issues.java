package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Issues implements GHList, GHType{

	public List<Issue> elements;
	
	public Issues(){
		this.elements = new ArrayList<>();
	}
	
	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof Issue) {
			elements.add((Issue) obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof Issue) {
			if (elements.contains(obj)) {
				elements.remove((Issue) obj);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Issue) {
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
			return new Issue();
		}
	}

	@Override
	public boolean put(int index, GHType element) {
		if (element instanceof Issue) {
			elements.add(index, (Issue) element);
			return true;
		}

		return false;

	}
	
	

	@Override
	public String toString() {
		return "Issues [issues=" + elements + "]";
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}

}
