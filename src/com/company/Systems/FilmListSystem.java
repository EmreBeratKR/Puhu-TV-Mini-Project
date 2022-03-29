package com.company.Systems;

import com.company.Entities.Film;
import com.company.Entities.FilmList;
import com.company.Helpers.Console;

public final class FilmListSystem
{
    private FilmListSystem(){}


    public static void showFilms(FilmList filmList)
    {
        if (filmList == null)
        {
            Console.printError("The List is Null!");
            return;
        }

        Console.printLine();

        System.out.printf("Films in %s:%n", filmList);

        int i = 1;
        for (var film : filmList.getFilms())
        {
            System.out.printf("(%d)-%s%n", i, film);
            i++;
        }

        Console.printLine();
    }

    public static void addFilm(Film film, FilmList filmList)
    {
        if (filmList == null) return;

        var oldList = filmList.getFilms();
        oldList.add(film);
        filmList.setFilms(oldList);
    }

    public static void removeFilm(Film film, FilmList filmList)
    {
        if (filmList == null) return;

        var oldList = filmList.getFilms();
        oldList.remove(film);
        filmList.setFilms(oldList);
    }

    public static Film selectFilm(int id, FilmList filmList)
    {
        if (filmList == null) return null;

        for (var film : filmList.getFilms())
        {
            if (film.getId() == id)
            {
                return film;
            }
        }
        return null;
    }

    public static Film selectFilm(String name, FilmList filmList)
    {
        if (filmList == null) return null;

        for (var film : filmList.getFilms())
        {
            if (film.getName().equals(name))
            {
                return film;
            }
        }
        return null;
    }
}
