class MyException extends Exception {
}

class Main {
    public static void main(String[] args) {
        try {
            doSometing();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    static void doSometing() throws MyException {
        MyException me = new MyException();
        throw me;
    }
}