class Sample6 {
    public static void main(String[] args) {
        String text = "hoge@example.com";
        int pos = text.indexOf("@");
        String user = text.substring(0, pos);
        System.out.println(user);
    }
}