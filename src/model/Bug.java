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

    public void setDescriptionBug(String descriptionBug) {
        if (descriptionBug.length() < 10) {
            System.out.println("This description of bug is too short");
        } else {
            this.descriptionBug = descriptionBug;
        }
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
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

    public void setPriorityBug(int priorityBug) {
        switch (priorityBug) {
            case 1:
                this.priorityBug = priorityBug;
                break;
            case 2:
                this.priorityBug = priorityBug;
                break;
            case 3:
                this.priorityBug = priorityBug;
                break;
            case 4:
                this.priorityBug = priorityBug;
                break;
            case 5:
                this.priorityBug = priorityBug;
                break;
            default: {
                System.out.println("Priority of bug is not between numbers 1 and 5");
            }
        }
    }

//    public void setPriorityBugByLochu(int priorityBug) {
//        if (priorityBug > 1 && priorityBug < 5){
//            this.priorityBug = priorityBug;
//        } else System.out.println("text");
//    }
//
//    public void setPriorityBugByLochuv2(int priorityBug) {
//        if (priorityBug >= 1){
//            System.out.println("do smth");
//        } else if (priorityBug >= 5){
//            System.out.println("do smth");
//        } else System.out.println(" do smth");
//    }

    public boolean isStatusBug() {
        return statusBug;
    }

    public void setStatusBug(boolean statusBug) {
        if (statusBug == true) {
            notifyStatusChange();
        } else {
            this.statusBug = statusBug;
        }
    }

    public Bug(String descriptionBug, BugReporter bugReporter, int priorityBug) {
        this.descriptionBug = descriptionBug;
        this.bugReporter = bugReporter;
        this.priorityBug = priorityBug;
        this.statusBug = false;
    }

//    public void returnAllInfoAboutBug() {
//        System.out.println("Short description about bug is " + descriptionBug + " . Email persn who`s report bug is "
//                + emailReportingPerson + " . Priority of report bug is " + priorityBug + " Status bug: " + statusBug);
//    }

//    public void shouldReturnPersonWhoReportBug() {
//        System.out.println("Person who`s repoty bug: " + emailReportingPerson);
//    }

    public int shouldReturnPriorityBug() {
        return priorityBug;
    }

    public void shouldReturnStatusBug() {
        System.out.println("Status of bug: " + statusBug);
    }

    @Override
    public int compareTo(Bug bug) {
        int compareResult = this.getDescriptionBug().compareTo(bug.getDescriptionBug());
        return compareResult;
    }
}
