package repository;

public class Pelicula {
    private final int FilmId;
    private final String title;
    private final String descr;
    private final String genre;

    public Pelicula(Pelicula pelicula) {
        this.FilmId = pelicula.FilmId;
        this.title = pelicula.title;
        this.descr = pelicula.descr;
        this.genre = pelicula.genre;
    }
}
