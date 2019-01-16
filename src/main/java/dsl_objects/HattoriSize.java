package dsl_objects;

import interfaces.MetricType;

public class HattoriSize implements MetricType {

	public GHString size = new GHString();

	public Ints empty_range = getRange("empty");
	public Ints tiny_range = getRange("tiny");
	public Ints small_range = getRange("small");
	public Ints medium_range = getRange("medium");
	public Ints large_range = getRange("large");

	//public GHFloat mean_size = new GHFloat();
	//public GHFloat median_size = new GHFloat();

	public void analyzeCommit(Commit commit) {
		this.size.string = calculateSize(commit.files.size());
	}

	@Override
	public void analyzeCommits(Commits commit) {

	}

	private String calculateSize(int size) {

		String metricSize = "";

		if (size == 0) {
			metricSize = "empty";
		} else if (size > tiny_range.elements.get(0).value && size < empty_range.elements.get(1).value) {
			metricSize = "tiny";
		} else if (size > small_range.elements.get(0).value && size < small_range.elements.get(1).value) {
			metricSize = "small";
		} else if (size > medium_range.elements.get(0).value && size < medium_range.elements.get(1).value) {
			metricSize = "medium";
		} else if (size > large_range.elements.get(0).value && size < large_range.elements.get(1).value) {
			metricSize = "large";
		}

		return metricSize;

	}

	private Ints getRange(String type) {
		Ints ints = new Ints();

		Int rangeStart = new Int();
		Int rangeEnd = new Int();

		if (type.equals("empty")) {
			rangeStart.value = 0;
			rangeEnd.value = 0;
		} else if (type.equals("tiny")) {
			rangeStart.value = 1;
			rangeEnd.value = 5;
		} else if (type.equals("small")) {
			rangeStart.value = 5;
			rangeEnd.value = 25;
		} else if (type.equals("medium")) {
			rangeStart.value = 25;
			rangeEnd.value = 125;
		} else if (type.equals("large")) {
			rangeStart.value = 125;
			rangeEnd.value = Integer.MAX_VALUE;
		}

		ints.add(rangeStart);
		ints.add(rangeEnd);

		return ints;

	}

}
