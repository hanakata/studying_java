class Sample6 {
    public static void main(String[] args) {
        try {
            int result = divOneTwo(args);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int divOneTwo(String[] args) {
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        return one / two;
    }
}