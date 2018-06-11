class Sample6 {
    public static void main(String[] args) {
        int[] test1;
        test1 = new int[3];
        System.out.println("test1");
        test1[0] = 80;
        test1[1] = 40;
        test1[2] = 20;

        int[] test2;
        test2 = new int[3];
        System.out.println("test2");
        test2 = test1;

        for (int i = 0; i < 3; i++) {
            System.out.println("test1" + (i + 1) + test1[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("test2" + (i + 1) + test2[i]);
        }
        test1[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println("test1" + (i + 1) + test1[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("test2" + (i + 1) + test2[i]);
        }
    }
}