package com.company.Systems;

import com.company.Entities.Film;
import com.company.Entities.FilmList;

public final class FilmListSystem
{
    private FilmListSystem(){}

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
