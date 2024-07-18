public class encapsulation {
    private String name;
    private int age;

    public encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name of student is: " + name);
        System.out.println("Age of student is: " + age);
    }
}
