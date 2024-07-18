public class methodOverriding {
    public void method1() {
        System.out.println("Hello");
    }

    class childClass extends methodOverriding {
        public void method1() {
            System.out.println("Hello World");
        }

    }

    public static void main(String[] args) {
        methodOverriding obj = new methodOverriding();
        obj.method1();

    }
}
