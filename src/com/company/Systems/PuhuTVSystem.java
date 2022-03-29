package com.company.Systems;

import com.company.Entities.FilmList;
import com.company.Entities.PuhuTV;
import com.company.Helpers.Console;

public final class PuhuTVSystem
{
    private PuhuTVSystem(){}


    public static void showFilmLists(PuhuTV puhuTV)
    {
        if (puhuTV == null)
        {
            Console.printError("PuhuTv is Null!");
            return;
        }

        Console.printLine();

        System.out.println("Film Lists:");

        int i = 1;
        for (var filmList : puhuTV.getFilmLists())
        {
            System.out.printf("(%d)-%s%n", i, filmList);
            i++;
        }

        Console.printLine();
    }

    public static void addFilmList(FilmList filmList, PuhuTV puhuTV)
    {
        if (puhuTV == null) return;

        var oldList = puhuTV.getFilmLists();
        oldList.add(filmList);
        puhuTV.setFilmLists(oldList);
    }

    public static void removeFilmList(FilmList filmList, PuhuTV puhuTV)
    {
        if (puhuTV == null) return;

        var oldList = puhuTV.getFilmLists();
        oldList.remove(filmList);
        puhuTV.setFilmLists(oldList);
    }

    public static FilmList selectFilmList(int id, PuhuTV puhuTV)
    {
        if (puhuTV == null) return null;

        for (var filmList : puhuTV.getFilmLists())
        {
            if (filmList.getId() == id)
            {
                return filmList;
            }
        }
        return null;
    }

    public static FilmList selectFilmList(String title, PuhuTV puhuTV)
    {
        if (puhuTV == null) return null;

        for (var filmList : puhuTV.getFilmLists())
        {
            if (filmList.getTitle().equals(title))
            {
                return filmList;
            }
        }
        return null;
    }
}
