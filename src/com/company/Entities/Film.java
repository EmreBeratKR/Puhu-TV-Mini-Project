package com.company.Entities;

import com.company.Entities.Human.Actor;
import com.company.Entities.Human.Director;
import com.company.Enums.FilmCategory;
import com.company.Enums.Language;

public class Film
{
    private final int id;
    private final String name;
    private final String description;
    private final FilmCategory[] categories;
    private final Language[] languages;
    private final int year;
    private final Duration duration;
    private final Director director;
    private final Actor[] actors;

    public Film(int id, String name)
    {
        this.id = id;
        this.name = name;
        this.description = null;
        this.categories = null;
        this.languages = null;
        this.year = -1;
        this.duration = Duration.Zero;
        this.director = null;
        this.actors = null;
    }

    public Film(int id, String name, String description, FilmCategory[] categories, Language[] languages, int year, Duration duration, Director director, Actor[] actors)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.categories = categories;
        this.languages = languages;
        this.year = year;
        this.duration = duration;
        this.director = director;
        this.actors = actors;
    }

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public String getDescription()
    {
        return this.description;
    }

    public FilmCategory[] getCategories()
    {
        return this.categories;
    }

    public Language[] getLanguages()
    {
        return this.languages;
    }

    public int getYear()
    {
        return this.year;
    }

    public Duration getDuration()
    {
        return this.duration;
    }

    public Director getDirector()
    {
        return this.director;
    }

    public Actor[] getActors()
    {
        return this.actors;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}
