package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Files implements GHList, GHType{
	
	public List<GHFile> files;
	
	public Files(){
		this.files = new ArrayList<>();
	}


	@Override
	public int size() {
		return files.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof GHFile) {
			files.add((GHFile) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof GHFile) {
			if (files.contains(obj)) {
				files.remove((GHFile) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof GHFile) {
			return files.contains(obj);
		}

		return false;
	}

	public List<GHFile> sortAsc(String field) {

		// TODO Check field and sort

		return files;
	}

	public List<GHFile> sortDesc(String field) {

		// TODO Check field and sort

		return files;
	}
	
	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

}
