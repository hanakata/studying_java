abstract class AbShape {
    int x;
    int y;
    int color;

    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setColor(int color) {
        this.color = color;
    }

    abstract double getArea();
}

class AbRect extends AbShape {
    double width;
    double height;

    AbRect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class AbCircle extends AbShape {
    double radius;

    AbCircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

class AbSample {
    public static void main(String[] args) {
        AbShape s1 = new AbRect(10.0, 5.0);
        s1.setXY(100, 200);
        s1.setColor(10);
        System.out.println(s1.getArea());

        AbShape s2 = new AbCircle(3.0);
        s1.setXY(150, 50);
        s1.setColor(11);
        System.out.println(s2.getArea());
    }
}