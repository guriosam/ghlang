package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Repositories implements GHList, GHType {

	public List<Repository> elements;

	public Repositories() {
		this.elements = new ArrayList<>();
	}

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof Repository) {
			elements.add((Repository) obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof Repository) {
			if (elements.contains(obj)) {
				elements.remove((Repository) obj);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Repository) {
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
			return new Repository();
		}
	}

	@Override
	public boolean put(int index, GHType element) {
		if (element instanceof Repository) {
			elements.add(index, (Repository) element);
			return true;
		}

		return false;

	}
	
	

	@Override
	public String toString() {
		return "Repositories [repositories=" + elements + "]";
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
	}
}
