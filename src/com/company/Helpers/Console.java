package com.company.Helpers;

import com.company.Entities.Film;
import com.company.Entities.FilmList;
import com.company.Entities.PuhuTV;
import com.company.Systems.FilmListSystem;
import com.company.Systems.PuhuTVSystem;

import java.util.Scanner;

public final class Console
{
    private static final Scanner scanner = new Scanner(System.in);


    private Console(){}


    public static void printLine()
    {
        System.out.println("------------------------------------------------------------");
    }

    public static void printError(String msg)
    {
        System.out.println("ERROR: " + msg);
    }

    public static String nextString()
    {
        return scanner.nextLine();
    }

    public static int nextInt()
    {
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public static FilmList selectFilmList(PuhuTV puhuTV)
    {
        if (puhuTV == null)
        {
            Console.printError("PuhuTV is Null!");
            return null;
        }

        PuhuTVSystem.showFilmLists(puhuTV);

        System.out.print("Pick a number for a list >");
        var choice = Console.nextInt();

        var filmLists = puhuTV.getFilmLists();

        if (choice < 1) return null;

        if (choice > filmLists.size()) return null;

        return filmLists.get(choice-1);
    }

    public static Film selectFilm(FilmList filmList)
    {
        if (filmList == null)
        {
            Console.printError("The List is Null!");
            return null;
        }

        FilmListSystem.showFilms(filmList);

        System.out.print("Pick a number for a film >");
        var choice = Console.nextInt();

        var films = filmList.getFilms();

        if (choice < 1) return null;

        if (choice > films.size()) return null;

        return films.get(choice-1);
    }
}
