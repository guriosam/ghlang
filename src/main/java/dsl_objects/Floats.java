package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Floats implements GHList, GHType{

	public List<GHFloat> elements;
	
	public Floats(){
		this.elements = new ArrayList<>();
	}
	
	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof GHFloat) {
			elements.add((GHFloat) obj);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof GHFloat) {
			if (elements.contains(obj)) {
				elements.remove((GHFloat) obj);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof GHFloat) {
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
			return new GHFloat();
		}
	}

	@Override
	public boolean put(int index, GHType element) {
		if (element instanceof GHFloat) {
			elements.add(index, (GHFloat) element);
			return true;
		}

		return false;

	}
	
	

	@Override
	public String toString() {
		return "Floats [floats=" + elements + "]";
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}
	
}
