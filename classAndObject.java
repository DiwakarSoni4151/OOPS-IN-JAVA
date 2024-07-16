class classAndObject { // class creation
    public int sum(int a, int b) {
        return a + b;

    }

    public static void main(String[] args) {
        classAndObject obj = new classAndObject(); // object Creation
        System.out.println(obj.sum(2, 3));
    }
}