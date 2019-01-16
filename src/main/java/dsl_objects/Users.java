package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Users implements GHList, GHType {

	public List<User> elements;

	public Users() {
		this.elements = new ArrayList<>();
	}

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof User) {
			elements.add((User) obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof User) {
			if (elements.contains(obj)) {
				elements.remove((User) obj);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof User) {
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
			return new User();
		}
	}

	@Override
	public boolean put(int index, GHType element) {
		if (element instanceof User) {
			elements.add(index, (User) element);
			return true;
		}

		return false;

	}
	
	

	@Override
	public String toString() {
		return "Users [users=" + elements + "]";
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}
}
