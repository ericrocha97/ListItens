package cf.ericrocha.listitens.model;

public class Movie {
    private String titleMovie;
    private String genre;
    private String year;

    public Movie(){
    }

    public Movie(String titleMovie, String genre, String year) {
        this.titleMovie = titleMovie;
        this.genre = genre;
        this.year = year;
    }

    public String getTitleMovie() {
        return titleMovie;
    }

    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
