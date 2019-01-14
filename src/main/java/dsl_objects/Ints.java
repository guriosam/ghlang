package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Ints implements GHList, GHType{

	public List<Int> ints;
	
	public Ints(){
		this.ints = new ArrayList<>();
	}
	
	@Override
	public int size() {
		return ints.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof Int) {
			ints.add((Int) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof Int) {
			if (ints.contains(obj)) {
				ints.remove((Int) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Int) {
			return ints.contains(obj);
		}

		return false;
	}

	public List<Int> sortAsc(String field) {

		// TODO Check field and sort

		return ints;
	}

	public List<Int> sortDesc(String field) {

		// TODO Check field and sort

		return ints;
	}
	
	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

}
