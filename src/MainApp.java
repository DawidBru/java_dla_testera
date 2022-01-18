import computer.Computer;
import computer.Laptop;
import computer.PC;
import model.Bug;
import model.BugReporter;
import model.User;
import utils.StringUtils;
import utils.WeekUtils;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<Bug> bugs = new ArrayList<>();

        BugReporter bugReporter = new BugReporter("Dawid", "Testowy", "dawid@test.pl");
        BugReporter bugReporter2 = new BugReporter("Marek", "Test", "marek@test.pl");
        BugReporter bugReporter3 = new BugReporter("Kasia", "Testowny", "kasia@test.pl");
        BugReporter bugReporter4 = new BugReporter("Zosia", "Testowa", "zosia@test.pl");
        BugReporter bugReporter5 = new BugReporter("Tomek", "Testowy", "tomek@test.pl");

        bugs.add(new Bug("Error", bugReporter, 3));
        bugs.add(new Bug("Error", bugReporter, 3));
        bugs.add(new Bug("Bad Gateway", bugReporter2, 4));
        bugs.add(new Bug("Bad request", bugReporter3, 6));
        bugs.add(new Bug("Unexpected error", bugReporter4, 7));
        bugs.add(new Bug("Error trouble", bugReporter5, 1));

//        for (Bug bug : bugs) {
//            System.out.println(bug);
//        }

        Set<Bug> uniqueBugs = new HashSet<>(bugs);
        for (Bug uniqueBug : uniqueBugs) {
            System.out.println(uniqueBug.getDescriptionBug() + " " + uniqueBug.getBugReporter() + " " +
                    uniqueBug.getPriorityBug());
        }

        System.out.println("    ");

        Set<Bug> sortedBug = new TreeSet<>(bugs);

        for (Bug bug : sortedBug) {
            System.out.println(bug.getDescriptionBug() + " " + bug.getBugReporter() + " " + bug.getPriorityBug());
        }
    }




