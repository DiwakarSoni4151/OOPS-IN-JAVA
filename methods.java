public class methods { // class
    public void areaOfRectangle(int l, int b) { // mehod
        int area = l * b;
        System.out.println("Area of rectangle is: " + area);
    }

    public static void main(String[] args) {
        methods obj = new methods(); // object
        obj.areaOfRectangle(5, 8); // method call

    }
}
