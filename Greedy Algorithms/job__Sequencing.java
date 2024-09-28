package Greedy__Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class job__Sequencing {

    static class job {
        int deadline;
        int profit;
        int id;

        public job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<job> jobs = new ArrayList<>();

        // Adding jobs
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // Sorting jobs in decreasing order of profit
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        // Using ArrayList instead of Arrays for seq
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        // Job sequencing
        for (int i = 0; i < jobs.size(); i++) {
            job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        // Print the result
        System.out.println("Max jobs = " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}
