package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Dates implements GHList, GHType {

	public List<GHDate> dates;

	public Dates() {
		this.dates = new ArrayList<>();
	}

	@Override
	public int size() {
		return dates.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof GHDate) {
			dates.add((GHDate) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof GHDate) {
			if (dates.contains(obj)) {
				dates.remove((GHDate) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof GHDate) {
			return dates.contains(obj);
		}

		return false;
	}

	public List<GHDate> sortAsc(String field) {

		// TODO Check field and sort

		return dates;
	}

	public List<GHDate> sortDesc(String field) {

		// TODO Check field and sort

		return dates;
	}
	
	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}
}
