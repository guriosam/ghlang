package dsl_objects;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Bools implements GHList, GHType {

	public List<Bool> bools;

	public Bools() {
		this.bools = new ArrayList<>();
	}

	@Override
	public int size() {
		return bools.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof Bool) {
			bools.add((Bool) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof Bool) {
			if (bools.contains(obj)) {
				bools.remove((Bool) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Bool) {
			return bools.contains(obj);
		}

		return false;
	}

	public List<Bool> sortAsc(String field) {

		// TODO Check field and sort

		return bools;
	}

	public List<Bool> sortDesc(String field) {

		// TODO Check field and sort

		return bools;
	}

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public String toString() {
		return "Bools [bools=" + bools + "]";
	}

}
