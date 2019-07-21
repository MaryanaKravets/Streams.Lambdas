package main.java.movies;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Cinema {
    private List<Movie> movieList1 = Arrays.asList(
            new Movie("Божевільна парочка", "комедія", 90),
            new Movie("Людина-павук", "фантастика", 120),
            new Movie("Хижаки", "бойовик", 130),
            new Movie("Анабель", "жахи", 95),
            new Movie("Історія іграшок", "мультфільм", 100));
    private List<Movie> movieList2 = Arrays.asList(
            new Movie("Анна", "бойовик", 105),
            new Movie("Біль та слава", "драма", 120),
            new Movie("Водій для копа", "бойовик", 150),
            new Movie("Секрети домашніх тварин", "мультфільм", 125),
            new Movie("Гамлет. Камбербетч", "драма", 110));

    Map<String, Double> averageTicketPrice() {
        return Stream.concat(this.movieList1.stream(), this.movieList2.stream())
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.averagingInt(Movie::getTicketPrice)));
    }

    Map<String, Long> numberOfMoviesByGivenGenre() {
        return Stream.concat(this.movieList1.stream(), this.movieList2.stream())
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
    }
}

