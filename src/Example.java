public class Example {
    String something;
    String car;
    String module;
    int count;
    int age;
    int howMany;
    boolean isEvenNumber;
    double small;

    public Example(String something, String car, String module, int count, int age, int howMany,
                   boolean isEvenNumber, double small) {
        this.something = something;
        this.car = car;
        this.module = module;
        this.count = count;
        this.age = age;
        this.howMany = howMany;
        this.isEvenNumber = isEvenNumber;
        this.small = small;
    }

    void showMeEveryThing() {
        System.out.println(something + " like a " + car + "create: " + module + "s" + count + age + howMany + isEvenNumber + small);
    }

    int letsCount() {
        return count;
    }

    int ageAge() {
        return age;
    }

    boolean returnNumberIs() {
        return isEvenNumber;
    }
}


