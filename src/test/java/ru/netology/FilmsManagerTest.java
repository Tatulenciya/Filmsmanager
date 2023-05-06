package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void shouldAddAndFindFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Film I");
        manager.addFilms("Film II");
        manager.addFilms("Film III");

        String[] expected = { "Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedOneFilm() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Love story");

        String[] expected = {"Love story"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedNothing() {
        FilmsManager manager = new FilmsManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFiveLastFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Film I");
        manager.addFilms("Film II");
        manager.addFilms("Film III");
        manager.addFilms("Film IV");
        manager.addFilms("Film V");
        manager.addFilms("Film VI");

        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFiveLastFilmIfHaveFive() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Film I");
        manager.addFilms("Film II");
        manager.addFilms("Film III");
        manager.addFilms("Film IV");
        manager.addFilms("Film V");

        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFourLastFilmIfHaveFour() {
        FilmsManager manager = new FilmsManager(4);

        manager.addFilms("Film I");
        manager.addFilms("Film II");
        manager.addFilms("Film III");
        manager.addFilms("Film IV");

        String[] expected = {"Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowThreeFilmsIfHaveThree() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Film I");
        manager.addFilms("Film II");
        manager.addFilms("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowTwoFilmsIfHaveTwo() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Film I");
        manager.addFilms("Film II");

        String[] expected = {"Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowOneFilmIfHaveOne() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowNothingIfHaveNotFilms() {
        FilmsManager manager = new FilmsManager();


        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
