class Sample3 {
    public static void main(String[] args) {
        int[] test = new int[5];
        test[0] = 80;
        test[1] = 70;
        test[2] = 60;
        test[3] = 50;
        test[4] = 40;

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ":" + test[i]);
        }
    }
}