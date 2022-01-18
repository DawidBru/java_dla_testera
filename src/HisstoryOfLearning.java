import computer.Computer;
import computer.Laptop;
import computer.PC;
import model.Bug;
import model.BugReporter;
import model.User;
import utils.StringUtils;
import utils.WeekUtils;

import java.util.*;

public class HisstoryOfLearning {}
//    public static void main(String[] args) {
//        Set<User> users = new HashSet<>();
//
//        users.add(new User("Bartek", "Testowy", "bartek@test.pl", 17));
//        users.add(new User("Bartek", "Testowy", "bartek@test.pl", 17));
//        users.add(new User("Marek", "Test", "marek@test.pl", 16));
//        users.add(new User("Kacper", "Testowalski", "kacper@test.pl", 19));
//        users.add(new User("Franek", "Testowiak", "franek@test.pl", 17));
//        users.add(new User("Wojtek", "Testowny", "wojtek@test.pl", 18));
//
//        System.out.println(users.size());
//
//        Set<User> sortedUser = new TreeSet<>(users);
//
//        for (User user : sortedUser) {
//            System.out.println(user.getFirstName() + " " + user.getLastName());
//
//        }
//
//
//        for (User user : users) {
//            System.out.println(user.getFirstName());
//        }
////        Collections.sort(users, Comparator.comparing(User::getFirstName));
//        System.out.println(users);
//
////        Collections.sort(users, Comparator.comparingInt(User::getAge));
//        for (User user : users) {
//            System.out.println(user.getFirstName() + " " + user.getAge());
//
//        }
//        LinkedList<String> elements = new LinkedList<>();
//
//
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Dawid");
//        names.add("Bartek");
//        names.add("Tomek");
//
//        System.out.println(names);
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//
////      USUNIĘCIE ELEMENTÓW Z LISTY
//        names.remove(0);
//        names.remove("Bartek");
//        System.out.println(names);
//
//
//        BugReporter bugReporter = new BugReporter("Dawid", "Brudny", "Dawid@wp.pl");
//        Bug bug = new Bug("Internet destroyed", bugReporter, 2);
//
//        System.out.println(bug);
//        bug.setStatusBug(true);
//        System.out.println(bugReporter);
//        System.out.println(bug);
//
//
//        Computer officeComputer = new PC("Office computer", "HP", 500, 128, true, "New");
//        Computer officeComputer2 = new PC("Office computer", "HP", 500, 128, true, "Old");
//        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, false, 50, "Asus");
//        Computer macBook = new Laptop("XGames", "HP GAMES", 500, 256, false, 23, "LG");
//
//        Computer[] computers = {officeComputer, officeComputer2, gamingLaptop, macBook};
//
//        for (Computer computer : computers) {
//            computer.switchOffState();
//        }
//
//        ((PC) officeComputer2).showComputerName();
//        ((Laptop) macBook).returnModelOfLaptop();
//        ((PC) officeComputer).returnTypeOfComputer();
//        ((PC) officeComputer).setConectedToElectricity(true);
//
//        System.out.println(gamingLaptop.volumeDown(30));
//        System.out.println(gamingLaptop.volumeUp(40));
//        System.out.println(gamingLaptop.volumeUp(20));
//        System.out.println(gamingLaptop.volumeUp(30));
//
//        System.out.println(officeComputer.volumeUp(30));
//        System.out.println(officeComputer.volumeDown(21));
//        System.out.println(officeComputer.volumeUp(43));
//        System.out.println(officeComputer.volumeUp(55));
//        System.out.println(officeComputer.volumeUp(55));
//
//        Integer intNumber = 10;
//        System.out.println(intNumber);
//
//        Double dbl = 2.3;
//
//        officeComputer.switchOnState();
//        System.out.println(officeComputer.getState());
//        gamingLaptop.switchOffState();
//        System.out.println(gamingLaptop.getState());
//
//        ((PC) officeComputer).showComputerName();
//
//        ((Laptop) gamingLaptop).setBatteryLevel(0);
//
//        gamingLaptop.switchOnState();
//        System.out.println(gamingLaptop.getState());
//
//
//        officeComputer.switchOnState();
//        System.out.println(officeComputer.getState());
//
//        ((PC) officeComputer).setConectedToElectricity(true);
//        officeComputer.switchOnState();
//        System.out.println(officeComputer.getState());
//
//
//        String dawidTest = StringUtils.getFormattedText("DawidTestowy");
//
//        System.out.println(dawidTest);
//
//
//        String text = StringUtils.getFormattedText("text");
//        System.out.println(text);
//
//        System.out.println(WeekUtils.MONDAY);
//
//
//        User u1 = new User("Marek", "Testowy", "marek@test.pl", 18);
//        User u2 = new User("Czarek", "Testowy", "czarek@test.pl", 19);
//        User u3 = new User("Darek", "Testowy", "darek@test.pl", 17);
//        User u4 = new User("Jarek", "Testowy", "jarek@test.pl", 20);
//
//        System.out.println(User.userCounter);
//        System.out.println(User.getUserCounter());
//
//
//        int i = 10;
//
//        while (i < 20) {
//            System.out.println(i);
//            i++;
//        }
//
//        do {
//            System.out.println("Jestem w sekcji DO");
//            System.out.println(i);
//            i++;
//        } while (i < 20);
//
//
//        int[] numbers = new int[10];
//        System.out.println("długość tablicy: " + numbers.length);
//
////  POSORTOWANIE LICZB Z TABLICY WEDŁUG WARTOŚCI - OD NAJMNIEJSZEJ DO NAJWIĘKSZEJ
//
//        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
//
//        int max;
//
//        for (int i = 0; i < numbers.length; i++) {
//            max = numbers[i];
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[j] > max) {
//                    max = numbers[j];
//                    numbers[j] = numbers[i];
//                    numbers[i] = max;
//                }
//            }
//        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
//
//        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
//
//        int min;
//
//        for (int i = 0; i < numbers.length; i++) {
//            min = numbers[i];
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[j] < min) {
//                    min = numbers[j];
//                    numbers[j] = numbers[i];
//                    numbers[i] = min;
//                }
//            }
//        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
//
//        int even = 0;
//        int odd = 0;
//
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                even += 1;
//            } else {
//                odd += 1;
//            }
//        }
//        System.out.println("liczby parzyste:" + even);
//        System.out.println("liczby nieparzyste:" + odd);
//
//        int number1 = numbers[0];
//        int number6 = numbers[numbers.length - 1];
//
//        numbers[0] = number6;
//        numbers[numbers.length - 1] = number1;
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];
//        numbers[0] = numbers[numbers.length - 1] - numbers[0];
//        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
//
//        String[] names = {"Bartek", "Czarek", "Marek", "Tadek", "Krystian", "Mati"};
//        System.out.println(names.length);
//
//        for (String name : names) {
//            System.out.println(name.toUpperCase());
//        }
//        for (int i = 0; i < names.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(names[i]);
//            }
//        }
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i].toLowerCase());
//        }
//
//        int number = 10;
//
////        number +=1;
////        System.out.println(number);
////        System.out.println(number++);
////        System.out.println(number);
//        System.out.println(++number);
//
//
//        Bug bug = new Bug("This is new", "ks@wp.pl", 1);
//        bug.getDescriptionBug();
//        bug.setDescriptionBug("Error with trying open window");
//        System.out.println(bug.getDescriptionBug());
////        bug.returnAllInfoAboutBug();
////        bug.setEmailReportingPerson("TOJESTNOWYEMAIL@wp.pl");
////        bug.returnAllInfoAboutBug();
////        bug.setPriorityBug(34);
////        bug.returnAllInfoAboutBug();
//
//
//        User user = new User("Dawid", "Testowy", "dawid@test.pl", 14);
//        System.out.println(user.getEmail());
//        user.setEmail("dawid@test2.pl");
//        System.out.println(user.getEmail());
//
//        model.Bug bug1 = new model.Bug("Bad Gateway", "agata@wp.pl", 3);
////        bug1.returnAllInfoAboutBug();
//        int bugPriority = bug1.shouldReturnPriorityBug();
//        System.out.println(bugPriority);
////        bug1.shouldReturnPersonWhoReportBug();
//        bug1.shouldReturnStatusBug();
//
//        model.Bug bug2 = new model.Bug("Error", "mati22@wp.pl", 7);
////        bug2.returnAllInfoAboutBug();
//        int bug2Priority = bug2.shouldReturnPriorityBug();
//        System.out.println(bug2Priority);
////        bug2.shouldReturnPersonWhoReportBug();
//        bug2.shouldReturnStatusBug();
//
//        Example example = new Example("D", "audi", "dd", 2, 3, 4, true,
//                2.2);
//        example.showMeEveryThing();
//        int count = example.letsCount();
//        System.out.println(count);
//        int ageAge = example.ageAge();
//        System.out.println(ageAge);
//        boolean number = example.returnNumberIs();
//        System.out.println(number);
//
//
//        String str1 = "Hello";
//        String str2 = "hello";
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));
//
//        String s = str1.toUpperCase();
//        System.out.println(s);
//
//        String s1 = str1.toLowerCase();
//        System.out.println(s1);
//        boolean he = str1.startsWith("He");
//        System.out.println(he);
//
//        boolean llo = str1.endsWith("llo");
//        System.out.println(llo);
//
//        System.out.println(str1.contains("ello"));
//        System.out.println("      ".isBlank());
//        System.out.println("".isEmpty());
//        String replace = str1.replace("llo", "QWERTY");
//        System.out.println(replace);
//
//        String replaceAll = str1.replaceAll("l", "XD");
//        System.out.println(replaceAll);
//        String substring = str1.substring(1, 4);
//        System.out.println(substring);
//
//        String textWithWhiteSpaces = "    to jes jakis text,który wlica spacje";
//        System.out.println(textWithWhiteSpaces.length());
//
//        String strip = textWithWhiteSpaces.strip();
//        System.out.println(strip);
//        System.out.println(strip.length());
//
//    }
//}
