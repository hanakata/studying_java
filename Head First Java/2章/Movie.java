class Movie {
    String title;
    String ganre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }
}

class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.ganre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.ganre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Byte Club";
        three.ganre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}