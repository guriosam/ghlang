package dsl_objects;

import interfaces.MetricType;

public class HattoriSize implements MetricType{
	
	public GHString size;
	
	public Ints empty_range;
	public Ints small_range;
	public Ints medium_range;
	public Ints large_range;
	
	public Float mean_size;
	public Float median_size;
	
	public void analyzeCommit(Commit commit){
		
	}

	@Override
	public void analyzeCommits(Commits commit) {
		// TODO Auto-generated method stub
		
	}


}
