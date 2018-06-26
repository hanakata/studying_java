class KahenSample {
    static void listNames(String... names) {
        System.out.println(names.length);
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        listNames("sss", "aaa", "kkk");
        listNames();
    }
}