class Sample10 {
    public static void main(String[] args) {
        int[][] test;
        test = new int[2][5];

        test[0][0] = 80;
        test[0][1] = 20;
        test[0][2] = 30;
        test[0][3] = 40;
        test[0][4] = 50;
        test[1][0] = 80;
        test[1][1] = 60;
        test[1][2] = 70;
        test[1][3] = 30;
        test[1][4] = 20;

        for (int i = 0; i < 5; i++) {
            System.out.println(test[0][i]);
            System.out.println(test[1][i]);
        }
    }
}