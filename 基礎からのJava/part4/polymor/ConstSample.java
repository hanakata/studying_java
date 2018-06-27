class CtShape {
    double getArea() {
        return 0;
    }
}

class CtRect extends CtShape {
    double width;
    double height;

    CtRect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class CtCircle extends CtShape {
    double radius;

    CtCircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

class ConstSample {
    public static void main(String[] args) {
        CtShape shape;
        shape = new CtRect(10.0, 5.0);
        System.out.println(shape.getArea());

        shape = new CtCircle(3.0);
        System.out.println(shape.getArea());
    }
}