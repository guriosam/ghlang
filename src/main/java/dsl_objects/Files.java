package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Files implements GHList, GHType{
	
	public List<GHFile> elements;
	
	public Files(){
		this.elements = new ArrayList<>();
	}


	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof GHFile) {
			elements.add((GHFile) obj);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof GHFile) {
			if (elements.contains(obj)) {
				elements.remove((GHFile) obj);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof GHFile) {
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
			return new GHFile();
		}
	}

	@Override
	public boolean put(int index, GHType element) {
		if (element instanceof GHFile) {
			elements.add(index, (GHFile) element);
			return true;
		}
		return false;
	}

	

	@Override
	public String toString() {
		return "Files [files=" + elements + "]";
	}


	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}

}
