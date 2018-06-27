class Super2 {
    static String sfield = "field super";

    static void smethod() {
        System.out.println("method super");
    }
}

class Sub2 extends Super2 {
    static String sfield = "field super";

    static void smethod() {
        System.out.println("method sub");
    }
}

class WhichSample2 {
    public static void main(String[] args) {
        Super2 s = new Sub2();
        System.out.println(s.sfield);
        s.smethod();
    }
}