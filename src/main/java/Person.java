public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person %s with age %d", name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
