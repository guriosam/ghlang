package dsl_objects;

import interfaces.GHType;

public class GHString implements GHType {

	public String string = "";

	public boolean contains(String substring) {
		return string.contains(substring);
	}

	@Override
	public boolean compare(GHType obj1) {
		return this.toString().equals(obj1.toString());
	}

	public Strings split(String splitter) {

		String[] aux = string.split(splitter);

		Strings strings = new Strings();

		for (int i = 0; i < aux.length; i++) {
			GHString ghString = new GHString();
			ghString.string = aux[i];
			strings.add(ghString);
		}

		return strings;

	}

	public String upper() {
		return string.toUpperCase();
	}

	public String lower() {
		return string.toLowerCase();
	}

	@Override
	public String toString() {
		return string;
	}

}
