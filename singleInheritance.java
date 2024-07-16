class SingleInheritance {
    static class Employee {
        int salary = 500000;
    }

    static class Engineer extends Employee { // single inheritace extends keyword is used
        int bonus = 10000;
    }

    public static void main(String[] args) {
        Engineer obj = new Engineer();
        System.out.println("Total salary: " + (obj.salary + obj.bonus));
    }
}