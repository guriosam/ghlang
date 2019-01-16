package dsl_objects;

import java.util.List;

import interfaces.MetricType;
import objects.NatureCommit;

public class HattoriNature implements MetricType {

	public GHString nature = new GHString();
	public Int forward_engineering_count= new Int();
	public Int reengineering_count = new Int();
	public Int corrective_engineering_count = new Int();
	public Int management_count = new Int();
	public Int empty_count = new Int();
	public Int uncategorized_count = new Int();

	public GHFloat forward_engineering_percent = new GHFloat();
	public GHFloat reengineering_percent = new GHFloat();
	public GHFloat corrective_engineering_percent = new GHFloat();
	public GHFloat management_percent = new GHFloat();
	public GHFloat empty_percent = new GHFloat();
	public GHFloat uncategorized_percent = new GHFloat();

	public Strings forward_engineering_keys = getNatureList("foward");
	public Strings reengineering_keys = getNatureList("reeg");
	public Strings corrective_engineering_keys = getNatureList("correct");
	public Strings management_keys = getNatureList("management");

	@Override
	public void analyzeCommit(Commit commit) {
		this.nature.string = calculateNature(commit.message.string);
	}

	@Override
	public void analyzeCommits(Commits commits) {
		for(Commit commit : commits.elements){
			calculateNature(commit.message.string);
		}
		
		this.nature.string = mostApperated(); 
		
	}

	private String mostApperated() {
		
		return null;
	}

	private Strings getNatureList(String string) {

		List<String> natures = NatureCommit.getNatureList(string);

		Strings str = new Strings();

		for (String n : natures) {
			GHString nature = new GHString();
			nature.string = n;
			str.add(nature);
		}

		return str;
	}

	public String calculateNature(String message) {

		String classification = "";

		if (message.equals("")) {
			classification = "Empty";
			empty_count.value++;

		} else {

			boolean b = true;

			for (String mana : NatureCommit.getNatureList("management")) {
				if (message.contains(mana)) {
					classification = "Management";
					management_count.value++;
					b = false;
					break;
				}
			}

			if (b) {
				for (String re : NatureCommit.getNatureList("reeg")) {
					if (message.contains(re)) {
						classification = "Reengineering";
						reengineering_count.value++;
						b = false;
						break;
					}
				}
			}
			if (b) {
				for (String co : NatureCommit.getNatureList("correct")) {
					if (message.contains(co)) {
						classification = "Corrective Engineering";
						corrective_engineering_count.value++;
						b = false;
						break;
					}
				}

			}
			if (b) {
				for (String fo : NatureCommit.getNatureList("foward")) {
					if (message.contains(fo)) {
						classification = "Forward Engineering";
						forward_engineering_count.value++;
						b = false;
						break;
					}
				}
			}

			if (b) {
				classification = "Uncategorized";
				uncategorized_count.value++;
			}

		}

		forward_engineering_percent.value = (forward_engineering_count.value / getSum());
		reengineering_percent.value = (reengineering_count.value / getSum());
		corrective_engineering_percent.value = (corrective_engineering_count.value / getSum());
		management_percent.value = (management_count.value / getSum());
		empty_percent.value = (empty_count.value / getSum());
		uncategorized_percent.value = (uncategorized_count.value / getSum());

		return classification;

	}

	private long getSum() {

		long sum = (forward_engineering_count.value + reengineering_count.value + corrective_engineering_count.value
				+ management_count.value + empty_count.value + uncategorized_count.value);

		if (sum == 0) {
			sum = 1;
		}

		return sum;
	}

}
