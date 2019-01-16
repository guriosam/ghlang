package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Strings implements GHList, GHType{

public List<GHString> elements;
	
	public Strings(){
		this.elements = new ArrayList<>();
	}

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof GHString) {
			elements.add((GHString) obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof GHString) {
			if (elements.contains(obj)) {
				elements.remove((GHString) obj);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof GHString) {
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
			return new GHString();
		}
	}

	@Override
	public boolean put(int index, GHType element) {
		if (element instanceof GHString) {
			elements.add(index, (GHString) element);
			return true;
		}

		return false;

	}
	
	

	@Override
	public String toString() {
		return "Strings [strings=" + elements + "]";
	}

	@Override
	public void reverse() {
		
	}

}
