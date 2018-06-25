class Sample5 {
    public static void main(String[] args) {
        try {
            int result = divOneTwo(args);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("run finally");
        }
    }

    static int divOneTwo(String[] args) {
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        return one / two;
    }
}