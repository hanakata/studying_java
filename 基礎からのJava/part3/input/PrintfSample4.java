class PrintfSample4 {
    public static void main(String[] args) {
        System.out.printf("num[%-5d]%n", 12);
        System.out.printf("num[%05d]%n", 12);
        System.out.printf("num[%+d]%n", 12);
        System.out.printf("num[%(d]%n", -12);
        System.out.printf("num[%,d]%n", 1234567890);
        System.out.printf("num[%#x]%n", 0x12);
    }
}