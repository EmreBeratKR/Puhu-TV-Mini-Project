package com.company.Entities;

import java.util.ArrayList;

public class FilmList
{
    private final int id;
    private final String title;
    private ArrayList<Film> films;

    public FilmList(int id, String title)
    {
        this.id = id;
        this.title = title;
        films = new ArrayList<>();
    }

    public int getId()
    {
        return this.id;
    }

    public String getTitle()
    {
        return this.title;
    }

    public ArrayList<Film> getFilms()
    {
        return new ArrayList<>(this.films);
    }

    public void setFilms(ArrayList<Film> films)
    {
        this.films = films;
    }

    @Override
    public String toString()
    {
        return this.title;
    }
}
