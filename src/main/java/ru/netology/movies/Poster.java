package ru.netology.movies;

public class Poster {

    private String[] movies = new String[0];
    private int limitOfFilmsGivenOut;

    public Poster() {
        this.limitOfFilmsGivenOut = 5;
    }

    public Poster(int limitOfFilmsGivenOut) {
        this.limitOfFilmsGivenOut = limitOfFilmsGivenOut;
    }

    public void add(String newMovies) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovies;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLAst() {
        int resultLength;
        if (limitOfFilmsGivenOut < movies.length) {
            resultLength = limitOfFilmsGivenOut;
        } else {
            resultLength = movies.length;
            ;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}

