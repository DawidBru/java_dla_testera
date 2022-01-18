package model;

import java.util.Objects;

public class User implements Comparable<User> {

    public static int userCounter = 0 ;

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && isAdult == user.isAdult && Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, isAdult, name);
    }

    void getFullName() {
        System.out.println(firstName + " " + lastName + " have an email address: " + email + " and have " + age + " years old. Is he adult ? -" + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean shouldReturnIsUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static int getUserCounter(){
        return userCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.endsWith(".ru")){
            System.out.println("RU emails are not allowed");
        }else{
        this.email = email;
    }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String firstName, String lastName, String email, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = shouldReturnIsUserAdult();
        userCounter++;
    }

    void greetings(String name) {
        System.out.println("Hi " + name + ". Niece to see you.");
    }

    void greetings(String name, String lastName) {
        System.out.println("Hi " + name + "  " + lastName + ". Niece to see you.");
    }

    void greetings(String fullName, boolean age) {
        System.out.println("Hi " + fullName + "  " + age + ". Niece to see you.");
    }

    void shouldReturnAllInfo(){
        System.out.println("Hi my name is " + firstName + " " + lastName+ ". My email address is "+ email+ ". I have "+
                age+ " years old. Am I adult? -" + isAdult);
    }


    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }

    void howAreYou(String name, int userAge, boolean likeCar, String typeOfCar, int engineSize) {
        System.out.println("Hi " + name + " you are " + userAge + " years old. Are you like car ? " +
                likeCar + " What type of car you prefer? " + typeOfCar + " How does engine have this car ? "
                + engineSize);
    }

    int yourAgePlusTen(int userAge) {
        return userAge + 10;
    }

    @Override
    public int compareTo(User user) {
        int compareResult = this.getFirstName().compareTo(user.getFirstName());
        if(compareResult == 0){
            compareResult = this.getLastName().compareTo(user.getLastName());
        }
        return compareResult;
    }
}
