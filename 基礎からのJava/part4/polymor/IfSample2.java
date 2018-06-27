class IfSample2 {
    public static void main(String[] args) {
        Shape s1 = new Rect(10.0, 5.0);
        System.out.println(s1.getArea());

        Shape s2 = new Circle(3.0);
        System.out.println(s2.getArea());
    }
}