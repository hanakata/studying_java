class Rect implements Shape {
    double width;
    double height;

    Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}