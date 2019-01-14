package dsl_objects;

import java.util.ArrayList;
import java.util.List;

import interfaces.GHList;
import interfaces.GHType;

public class Repositories implements GHList, GHType{

public List<Repository> repositories;
	
	public Repositories(){
		this.repositories = new ArrayList<>();
	}

	@Override
	public int size() {
		return repositories.size();
	}

	@Override
	public void add(GHType obj) {
		if (obj instanceof Repository) {
			repositories.add((Repository) obj);
		}
	}

	@Override
	public void remove(GHType obj) {
		if (obj instanceof Repository) {
			if (repositories.contains(obj)) {
				repositories.remove((Repository) obj);
			}
		}
	}

	@Override
	public boolean contains(GHType obj) {
		if (obj instanceof Repository) {
			return repositories.contains(obj);
		}

		return false;
	}

	public List<Repository> sortAsc(String field) {

		// TODO Check field and sort

		return repositories;
	}

	public List<Repository> sortDesc(String field) {

		// TODO Check field and sort

		return repositories;
	}
	
	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}
}
