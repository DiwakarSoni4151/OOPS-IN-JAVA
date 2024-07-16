public class instanceVariable {
    String name = "John"; // instance variable
    int age = 30; // instance variable

    public void name() {
        System.out.println("Name of student is: " + name);
    }

    public void age() {
        System.out.println("Age of studet is: " + age);
    }

    public static void main(String[] arge) {
        instanceVariable obj = new instanceVariable();
        obj.name();
        obj.age();
    }
}
