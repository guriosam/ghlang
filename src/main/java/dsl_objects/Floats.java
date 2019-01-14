package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Floats implements GHList, GHType{

	public List<Float> floats;
	
	public Floats(){
		this.floats = new ArrayList<>();
	}
	
	@Override
	public int size() {
		return floats.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof Float) {
			floats.add((Float) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof Float) {
			if (floats.contains(obj)) {
				floats.remove((Float) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Float) {
			return floats.contains(obj);
		}

		return false;
	}

	public List<Float> sortAsc(String field) {

		// TODO Check field and sort

		return floats;
	}

	public List<Float> sortDesc(String field) {

		// TODO Check field and sort

		return floats;
	}

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}
	
}
