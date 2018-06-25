class Sample{
    public static void main(String[] args) {
        int result = divOneTwo(args);
        System.out.println(result);
    }
    static int divOneTwo(String[] args){
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        return one / two;
    }
}