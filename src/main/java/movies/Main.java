package main.java.movies;

public class Main {

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        System.out.println("Average ticket price for each genre:\n" + cinema.averageTicketPrice());
        System.out.println("Number of movies for each genre:\n" + cinema.numberOfMoviesByGivenGenre());
    }
}

