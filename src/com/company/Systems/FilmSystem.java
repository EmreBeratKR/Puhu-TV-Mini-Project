package com.company.Systems;

import com.company.Entities.Film;
import com.company.Helpers.Console;

public final class FilmSystem
{
    private FilmSystem(){}


    public static void showDetails(Film film)
    {
        if (film == null)
        {
            Console.printError("The Film is Null!");
            return;
        }

        Console.printLine();

        System.out.println(film.getName());

        Console.printLine();

        System.out.println("Description:");
        System.out.println(film.getDescription());

        Console.printLine();

        System.out.println("Categories:");
        for (var category : film.getCategories())
        {
            System.out.println(category);
        }

        Console.printLine();

        System.out.println("Languages:");
        for (var language : film.getLanguages())
        {
            System.out.println(language);
        }

        Console.printLine();

        System.out.printf("Release Year: %d%n", film.getYear());

        Console.printLine();

        System.out.println("Duration: " + film.getDuration());

        Console.printLine();

        System.out.println("Director: " + film.getDirector());

        Console.printLine();

        System.out.println("Actors:");
        for (var actor : film.getActors())
        {
            System.out.println(actor);
        }

        Console.printLine();
    }
}
