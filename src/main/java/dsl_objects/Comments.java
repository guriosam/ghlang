package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Comments implements GHList, GHType {

	public List<Comment> elements = new ArrayList<>();

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean add(GHType obj) {
		if (obj instanceof Comment) {
			elements.add((Comment) obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(GHType obj) {
		if (obj instanceof Comment) {
			if (elements.contains(obj)) {
				elements.remove((Comment) obj);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Comment) {
			return elements.contains(obj);
		}

		return false;
	}

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	@Override
	public String toString() {
		return "Comments [comments=" + elements + "]";
	}

	@Override
	public void reverse() {

	}

	@Override
	public GHType get(int position) {
		if (elements.size() > position) {
			return elements.get(position);
		} else {
			return new Comment();
		}
	}

	@Override
	public boolean put(int index, GHType element) {
		if (element instanceof Comment) {
			elements.add(index, (Comment) element);
			return true;
		}

		return false;

	}

}
