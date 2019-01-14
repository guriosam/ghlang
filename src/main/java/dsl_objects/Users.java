package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Users implements GHList, GHType {

	public List<User> users;

	public Users() {
		this.users = new ArrayList<>();
	}

	@Override
	public int size() {
		return users.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof User) {
			users.add((User) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof User) {
			if (users.contains(obj)) {
				users.remove((User) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof User) {
			return users.contains(obj);
		}

		return false;
	}

	public List<User> sortAsc(String field) {

		switch (field) {

		}

		return users;
	}

	public List<User> sortDesc(String field) {

		// TODO Check field and sort

		return users;
	}

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}
}
