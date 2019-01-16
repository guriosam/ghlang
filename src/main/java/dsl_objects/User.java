package dsl_objects;

import interfaces.GHType;
import interfaces.GHTypeAPI;

public class User implements GHType, GHTypeAPI {

	public GHString login = new GHString();
	public GHString id = new GHString();
	public GHString html_url = new GHString();
	public GHString type = new GHString();
	public Bool site_admin = new Bool();
	public GHString name = new GHString();
	public GHString company = new GHString();
	public GHString location = new GHString();
	public GHString email = new GHString();
	public GHString bio = new GHString();
	public Int public_repos = new Int();
	public Int followers = new Int();
	public Int following = new Int();
	public GHDate created_at = new GHDate();
	public GHDate updated_at = new GHDate();

	public User collectData(String path, String username) {

		return this;
	}

	@Override
	public boolean compare(GHType obj1) {
		// TODO Auto-generated method stub
		return this.toString().equals(obj1.toString());
	}

	@Override
	public String toString() {
		return "User [login=" + login +",\n id=" + id +",\n html_url=" + html_url +",\n type=" + type +",\n site_admin="
				+ site_admin +",\n name=" + name +",\n company=" + company +",\n location=" + location +",\n email=" + email
				+",\n bio=" + bio +",\n public_repos=" + public_repos +",\n followers=" + followers +",\n following="
				+ following +",\n created_at=" + created_at +",\n updated_at=" + updated_at + "]";
	}

}
