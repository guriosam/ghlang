package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Ints implements GHList, GHType{

	public List<Int> elements;
	
	public Ints(){
		this.elements = new ArrayList<>();
	}
	
	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof Int) {
			elements.add((Int) obj);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof Int) {
			if (elements.contains(obj)) {
				elements.remove((Int) obj);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Int) {
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
			return new Int();
		}
	}

	@Override
	public boolean put(int index, GHType element) {
		if (element instanceof Int) {
			elements.add(index, (Int) element);
			return true;
		}

		return false;

	}
	
	

	@Override
	public String toString() {
		return "Ints [ints=" + elements + "]";
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}

}
