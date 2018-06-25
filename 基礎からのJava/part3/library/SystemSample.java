class SystemSample {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();

        int num = 0;
        for (int i = 0; i < 10000 * 1000; i++) {
            num += i;
        }
        long time2 = System.currentTimeMillis();
        System.out.println(num);
        System.out.println(time2 - time1);
    }
}