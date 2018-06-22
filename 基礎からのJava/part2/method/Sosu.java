class Sosu {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        for (int i = 1; i < max; i++) {
            boolean isSosu = checkSosu(i);
            if (isSosu) {
                System.out.println(i);
            }
        }
        System.out.println("END");
    }

    static boolean checkSosu(int i) {
        boolean isSosu = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                isSosu = false;
                break;
            }
        }
        return isSosu;
    }
}