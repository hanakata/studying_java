class Sample8 {
    public static void main(String[] args) {
        sleep1s();
    }

    static void sleep1s() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}