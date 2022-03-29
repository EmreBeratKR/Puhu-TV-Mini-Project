package com.company.Entities;

import com.company.Helpers.MyRandom;

import java.util.ArrayList;

public class PuhuTV
{
    private final int sessionId;
    private ArrayList<FilmList> filmLists;


    public PuhuTV()
    {
        sessionId = MyRandom.Range(0, 10000);
        filmLists = new ArrayList<>();
    }


    public int getSessionId()
    {
        return this.sessionId;
    }

    public ArrayList<FilmList> getFilmLists()
    {
        return new ArrayList<>(this.filmLists);
    }

    public void setFilmLists(ArrayList<FilmList> filmLists)
    {
        this.filmLists = filmLists;
    }
}
