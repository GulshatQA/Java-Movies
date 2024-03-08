package ru.netology.movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterTest {

    @Test
    public void testFindAll() {
        Poster poster = new Poster();

        String movie1 = "Джентельмены";
        String movie2 = "Отель Белград";
        String movie3 = "Холоп";
        String movie4 = "Кандагар";
        String movie5 = "Мадагаскар";
        String movie6 = "Движение вверх";
        String movie7 = "Месть от кутюр";
        String movie8 = "Иллюзия обмана";

        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
        poster.add(movie8);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastLessThanTheLimit() {
        Poster poster = new Poster();

        String movie1 = "Джентельмены";
        String movie2 = "Отель Белград";
        String movie3 = "Холоп";

        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);

        String[] expected = {movie3, movie2, movie1};
        String[] actual = poster.findLAst();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastLessThanTheLimit2() {
        Poster poster = new Poster(13);

        String movie1 = "Джентельмены";
        String movie2 = "Отель Белград";
        String movie3 = "Холоп";
        String movie4 = "Кандагар";
        String movie5 = "Мадагаскар";
        String movie6 = "Движение вверх";
        String movie7 = "Месть от кутюр";
        String movie8 = "Иллюзия обмана";

        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
        poster.add(movie8);

        String[] expected = {movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = poster.findLAst();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastMoreThanTheLimit() {
        Poster poster = new Poster();

        String movie1 = "Джентельмены";
        String movie2 = "Отель Белград";
        String movie3 = "Холоп";
        String movie4 = "Кандагар";
        String movie5 = "Мадагаскар";
        String movie6 = "Движение вверх";
        String movie7 = "Месть от кутюр";

        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);

        String[] expected = {movie7, movie6, movie5, movie4, movie3};
        String[] actual = poster.findLAst();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastMoreThanTheLimit2() {
        Poster poster = new Poster(7);

        String movie1 = "Джентельмены";
        String movie2 = "Отель Белград";
        String movie3 = "Холоп";
        String movie4 = "Кандагар";
        String movie5 = "Мадагаскар";
        String movie6 = "Движение вверх";
        String movie7 = "Месть от кутюр";
        String movie8 = "Иллюзия обмана";
        String movie9 = "Шрек";
        String movie10 = "Красивый, плохой, злой";
        String movie11 = "Властелин колец";

        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
        poster.add(movie8);
        poster.add(movie9);
        poster.add(movie10);
        poster.add(movie11);

        String[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5};
        String[] actual = poster.findLAst();

        Assertions.assertArrayEquals(expected, actual);
    }
}