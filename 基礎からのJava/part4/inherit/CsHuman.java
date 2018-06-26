class CsApe {
    String favorite;

    CsApe() {
        favorite = "Banana";
        System.out.println("Call CsApp");
    }

    CsApe(String f) {
        favorite = f;
        System.out.println("Call CsApe");
    }
}

class CsHuman extends CsApe {
    CsHuman() {
        super();
        System.out.println("Call CsHuman");
    }

    CsHuman(String f) {
        super(f);
        System.out.println("Call CsHuman");
    }
}

class CsHumanMain {
    public static void main(String[] args) {
        CsHuman h1 = new CsHuman();
        System.out.println(h1.favorite);

        CsHuman h2 = new CsHuman("money");
        System.out.println(h2.favorite);
    }
}