package model;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {
    private String descriptionBug;
    private int priorityBug;
    private boolean statusBug;
    private BugReporter bugReporter;

    public String getDescriptionBug() {
        return descriptionBug;
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "descriptionBug='" + descriptionBug + '\'' +
                ", priorityBug=" + priorityBug +
                ", statusBug=" + statusBug +
                ", bugReporter=" + bugReporter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return priorityBug == bug.priorityBug && statusBug == bug.statusBug && Objects.equals(descriptionBug, bug.descriptionBug) && Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descriptionBug, priorityBug, statusBug, bugReporter);
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Change status");
    }



    public int getPriorityBug() {
        return priorityBug;
    }

    public Bug(String descriptionBug, BugReporter bugReporter, int priorityBug) {
        this.descriptionBug = descriptionBug;
        this.bugReporter = bugReporter;
        this.priorityBug = priorityBug;
        this.statusBug = false;
    }

    @Override
    public int compareTo(Bug bug) {
        int compareResult = this.getDescriptionBug().compareTo(bug.getDescriptionBug());
        return compareResult;
    }
}
