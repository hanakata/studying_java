class LabelSample {
    public static void main(String[] args) {
        outer_roop: for (int i = 0; i < 3; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outer_roop;
                }
                System.out.println("j: " + j);
            }

        }
    }
}