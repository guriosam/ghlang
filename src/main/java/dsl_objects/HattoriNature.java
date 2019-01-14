package dsl_objects;

import interfaces.MetricType;

public class HattoriNature implements MetricType{
	
	public GHString nature;
	public Int forward_engineering_count;
	public Int reengineering_count;
	public Int corrective_engineering_count;
	public Int management_count;
	
	public Float forward_engineering_percent;
	public Float reengineering_percent;
	public Float corrective_engineering_percent;
	public Float management_percent;
	
	public Strings forward_engineering_keys;
	public Strings reengineering_keys;
	public Strings corrective_engineering_keys;
	public Strings management_keys;
	
	@Override
	public void analyzeCommit(Commit commit) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void analyzeCommits(Commits commit) {
		// TODO Auto-generated method stub
		
	}
	

}

