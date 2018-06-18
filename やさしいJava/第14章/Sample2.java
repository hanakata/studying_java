class Sample2 {
    public static void main(String[] args) {
        try {
            int[] test;
            test = new int[5];
            System.out.println("insert test[10]");
            test[10] = 80;
            System.out.println("insert test[10] complete");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array is over");
        }
        System.out.println("Finish");
    }
}