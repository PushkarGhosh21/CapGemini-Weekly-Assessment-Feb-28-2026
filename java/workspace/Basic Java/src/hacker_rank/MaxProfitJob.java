package hacker_rank;

import java.util.Arrays;
import java.util.Comparator;

public class MaxProfitJob {

	static class Job {
        int start, end, profit;
        Job(int s, int e, int p) {
            start = s;
            end = e;
            profit = p;
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
 
        int n = startTime.length;
        Job[] jobs = new Job[n];
 
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
 
        Arrays.sort(jobs, new Comparator<Job>() {
            @Override
			public int compare(Job a, Job b) {
                return a.end - b.end;
            }
        });
 
        int[] dp = new int[n];
        dp[0] = jobs[0].profit;
 
        for (int i = 1; i < n; i++) {
 
            int include = jobs[i].profit;
 
        
            for (int j = i - 1; j >= 0; j--) {
                if (jobs[j].end <= jobs[i].start) {
                    include += dp[j];
                    break;
                }
            }
 
            dp[i] = Math.max(dp[i - 1], include);
        }
 
        return dp[n - 1];
    }
}
