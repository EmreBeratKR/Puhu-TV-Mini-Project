package com.company.Entities;

import com.company.Entities.Human.Actor;
import com.company.Entities.Human.Director;
import com.company.Enums.FilmCategory;
import com.company.Enums.Language;

public class Film
{
    private final int id;
    private String name;
    private String description;
    private FilmCategory[] categories;
    private Language[] languages;
    private int year;
    private Duration duration;
    private Director director;
    private Actor[] actors;


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

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public FilmCategory[] getCategories()
    {
        return this.categories;
    }

    public void setCategories(FilmCategory[] categories)
    {
        this.categories = categories;
    }

    public Language[] getLanguages()
    {
        return this.languages;
    }

    public void setLanguages(Language[] languages)
    {
        this.languages = languages;
    }

    public int getYear()
    {
        return this.year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public Duration getDuration()
    {
        return this.duration;
    }

    public void setDuration(Duration duration)
    {
        this.duration = duration;
    }

    public Director getDirector()
    {
        return this.director;
    }

    public void setDirector(Director director)
    {
        this.director = director;
    }

    public Actor[] getActors()
    {
        return this.actors;
    }

    public void setActors(Actor[] actors)
    {
        this.actors = actors;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}
