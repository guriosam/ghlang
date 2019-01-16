package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Dates implements GHList, GHType {

	public List<GHDate> elements;

	public Dates() {
		this.elements = new ArrayList<>();
	}

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof GHDate) {
			elements.add((GHDate) obj);
			return true;
		}

		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof GHDate) {
			if (elements.contains(obj)) {
				elements.remove((GHDate) obj);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof GHDate) {
			return elements.contains(obj);
		}

		return false;
	}

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public GHType get(int position) {
		if (elements.size() > position) {
			return elements.get(position);
		} else {
			return new Bool();
		}
	}

	@Override
	public boolean put(int index, GHType element) {
		if (element instanceof GHDate) {
			elements.add(index, (GHDate) element);
			return true;
		}

		return false;

	}

	@Override
	public String toString() {
		return "Dates [dates=" + elements + "]";
	}
	
	
}
