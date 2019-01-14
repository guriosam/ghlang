package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Strings implements GHList, GHType{

public List<GHString> strings;
	
	public Strings(){
		this.strings = new ArrayList<>();
	}

	@Override
	public int size() {
		return strings.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof GHString) {
			strings.add((GHString) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof GHString) {
			if (strings.contains(obj)) {
				strings.remove((GHString) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof GHString) {
			return strings.contains(obj);
		}

		return false;
	}

	public List<GHString> sortAsc(String field) {

		// TODO Check field and sort

		return strings;
	}

	public List<GHString> sortDesc(String field) {

		// TODO Check field and sort

		return strings;
	}
	
	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

}
