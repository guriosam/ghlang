package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Commits implements GHList, GHType {

	public List<Commit> elements;

	public Commits() {
		this.elements = new ArrayList<>();
	}

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof Commits) {
			elements.add((Commit) obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof Commits) {
			if (elements.contains(obj)) {
				elements.remove((Commit) obj);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Commit) {
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
			return new Commit();
		}
	}

	@Override
	public boolean put(int index, GHType element) {
		if (element instanceof Commit) {
			elements.add(index, (Commit) element);
			return true;
		}

		return false;

	}
	
	

	@Override
	public String toString() {
		return "Commits [commits=" + elements + "]";
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}
}
