package interfaces;

import dsl_objects.Commit;
import dsl_objects.Commits;

public interface MetricType {

	public void analyzeCommit(Commit commit);
	
	public void analyzeCommits(Commits commit);

}
