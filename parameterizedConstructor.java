class parameterizedConstructor {
    // data member of class
    String name;
    int age;
    int roll;

    parameterizedConstructor(String name, int age, int roll) { // parameterized constructor
        this.name = name;
        this.age = age;
        this.roll = roll;
    }
}

class parameterized {
    public static void main(String[] args) {
        parameterizedConstructor obj = new parameterizedConstructor("Dale", 25, 50);
        System.out.println(obj.name + "," + obj.age + "," + obj.roll);
    }
}