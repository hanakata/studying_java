class SwitchSample {
    public static void main(String[] args) {
        int num = 3;

        switch (num) {
        case 1:
            System.out.println("1");
            break;
        case 3:
            System.out.println("3");
            break;
        default:
            System.out.println("Another");
            break;
        }
        System.out.println("After...");
    }
}