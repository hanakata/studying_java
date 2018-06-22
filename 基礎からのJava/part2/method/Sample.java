class Sample{
    public static void main(String[] args) {
        System.out.println("before");
        doSomething();
        System.out.println("after");
    }
    static void doSomething(){
        System.out.println("call");
    }
}