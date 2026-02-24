import java.util.*;

class Task Scheduler{
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char t : tasks) {
            freq[t - 'A']++;
        }

        Arrays.sort(freq); // sort ascending
        int maxFreq = freq[25];
        int maxCount = 0;

        for (int f : freq) {
            if (f == maxFreq) maxCount++;
        }

        int intervals = (maxFreq - 1) * (n + 1) + maxCount;
        return Math.max(intervals, tasks.length);
    }
}