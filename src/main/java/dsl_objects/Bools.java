package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Bools implements GHList, GHType {

	public List<Bool> elements = new ArrayList<>();

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof Bool) {
			elements.add((Bool) obj);
			return true;
		}

		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof Bool) {
			if (elements.contains(obj)) {
				elements.remove((Bool) obj);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Bool) {
			return elements.contains(obj);
		}

		return false;
	}

	@Override
	public boolean compare(GHType obj1) {
		return elements.toString().equals(obj1.toString());
	}

	@Override
	public String toString() {
		return "Bools [bools=" + elements + "]";
	}

	@Override
	public void reverse() {
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
		if(element instanceof Bool){
			elements.add(index, (Bool) element);
			return true;
		}
		
		return false;
	
	}

}
