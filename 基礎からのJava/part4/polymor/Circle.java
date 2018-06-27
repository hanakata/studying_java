class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}