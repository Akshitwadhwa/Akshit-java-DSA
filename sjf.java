import java.util.*;

class sjf {
    static class Process {
        int id, burstTime, waitTime, turnAroundTime;
        Process(int id, int burstTime) {
            this.id = id;
            this.burstTime = burstTime;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        Process[] processes = new Process[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter burst time for process " + (i + 1) + ": ");
            processes[i] = new Process(i + 1, sc.nextInt());
        }

        Arrays.sort(processes, Comparator.comparingInt(p -> p.burstTime));

        int totalWait = 0, totalTAT = 0;
        System.out.println("\nProcess\tBurst\tWait\tTurnaround");
        for (int i = 0; i < n; i++) {
            Process p = processes[i];
            p.waitTime = i == 0 ? 0 : processes[i - 1].waitTime + processes[i - 1].burstTime;
            p.turnAroundTime = p.waitTime + p.burstTime;
            totalWait += p.waitTime;
            totalTAT += p.turnAroundTime;

            System.out.println(p.id + "\t" + p.burstTime + "\t" + p.waitTime + "\t" + p.turnAroundTime);
        }

        System.out.printf("\nAverage Waiting Time: %.2f\n", (float) totalWait / n);
        System.out.printf("Average Turnaround Time: %.2f\n", (float) totalTAT / n);
        sc.close();
    }
}
