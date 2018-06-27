class Super {
    String field = "field super";

    void method() {
        System.out.println("method super");
    }
}

class Sub extends Super {
    String field = "field sub";

    void method() {
        System.out.println("method sub");
    }
}

class WhichSample {
    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.field);
        s.method();
    }
}