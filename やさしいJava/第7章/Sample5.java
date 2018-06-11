class Sample5 {
    public static void main(String[] args) {
        int[] test1;
        test1 = new int[3];

        System.out.println("test1");

        test1[0] = 90;
        test1[1] = 60;
        test1[2] = 50;

        int[] test2;
        System.out.println("test2");
        test2 = test1;

        for (int i = 0; i < 3; i++) {
            System.out.println("test1" + (i + 1) + ":" + test1[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("test2" + (i + 1) + ":" + test2[i]);
        }
    }
}