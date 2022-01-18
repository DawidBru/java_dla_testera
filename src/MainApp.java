import model.Bug;
import model.BugReporter;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<Bug> bugs = new ArrayList<>();

        BugReporter bugReporter = new BugReporter("Dawid", "Testowy", "dawid@test.pl");
        BugReporter bugReporter2 = new BugReporter("Marek", "Test", "marek@test.pl");
        BugReporter bugReporter3 = new BugReporter("Kasia", "Testowny", "kasia@test.pl");
        BugReporter bugReporter4 = new BugReporter("Zosia", "Testowa", "zosia@test.pl");
        BugReporter bugReporter5 = new BugReporter("Tomek", "Testowy", "tomek@test.pl");

        bugs.add(new Bug("1 Error", bugReporter, 3));
        bugs.add(new Bug("1 Error", bugReporter, 3));
        bugs.add(new Bug("3 Bad Gateway", bugReporter2, 4));
        bugs.add(new Bug("5 Bad request", bugReporter3, 6));
        bugs.add(new Bug("4 Unexpected error", bugReporter4, 7));
        bugs.add(new Bug("2 Error trouble", bugReporter5, 1));

        for (Bug bug : bugs) {
            System.out.println(bug.getDescriptionBug());
        }

        System.out.println("--- Unique Value SET ---  ");

        Set<Bug> uniqueBugs = new HashSet<>(bugs);
        for (Bug uniqueBug : uniqueBugs) {
            System.out.println(uniqueBug.getDescriptionBug() + " " + uniqueBug.getBugReporter() + " " +
                    uniqueBug.getPriorityBug());
        }

        System.out.println("----  Sorted By Description Bug ----  ");

        Set<Bug> sortedBug = new TreeSet<>(uniqueBugs);

        for (Bug bug : sortedBug) {
            System.out.println(bug.getDescriptionBug() + " " + bug.getBugReporter() + " " + bug.getPriorityBug());
        }
    }
}




