class IfSample3 {
    public static void main(String[] args) {
        Shape s1 = new Rect(10.5, 5.0);
        showArea(s1);
        
        Shape s2 = new Circle(3.0);
        showArea(s2);
    }

    static void showArea(Shape shape) {
        System.out.println(shape.getArea());
    }
}