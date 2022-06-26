public class AfishaManager {
    private FilmItem[] movies = new FilmItem[0];

    private int resultLength;


    public AfishaManager() {
        resultLength = 10;
    }

    public AfishaManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void add(FilmItem film) {
        int length = movies.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int LastIndex = tmp.length - 1;
        tmp[LastIndex] = film;
        movies = tmp;
    }

    public FilmItem[] findAll() {
        return movies;
    }

    public FilmItem[] findLast() {
        FilmItem[] ans;
        if (resultLength < movies.length) {
            ans = new FilmItem[resultLength];
        } else {
            ans = new FilmItem[movies.length];
        }
        for (int i = 0; i < ans.length; i++) {
            int index = movies.length - i - 1;
            ans[i] = movies[index];
        }
        return ans;

    }

}
