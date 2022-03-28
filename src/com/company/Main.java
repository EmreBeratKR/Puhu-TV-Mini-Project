package com.company;

import com.company.Entities.Film;
import com.company.Entities.FilmList;
import com.company.Entities.PuhuTV;
import com.company.Systems.FilmListSystem;
import com.company.Systems.PuhuTVSystem;

public class Main {

    public static void main(String[] args)
    {

        var service = new PuhuTV();

        var filmList = new FilmList(7, "Foreign Films");
        var filmList1 = new FilmList(13, "Western Films");

        FilmListSystem.addFilm(new Film(1, "Star Wars"), filmList);
        FilmListSystem.addFilm(new Film(5, "Redkit"), filmList1);

        PuhuTVSystem.addFilmList(filmList, service);
        PuhuTVSystem.addFilmList(filmList1, service);

        // select film list by id
        var choosenList = PuhuTVSystem.selectFilmList(7, service);
        // select film list by title
        var choosenList1 = PuhuTVSystem.selectFilmList("Western Films", service);

        System.out.println("First List : " + choosenList);
        System.out.println("Second List : " + choosenList1);

        // select film list by name
        var film = FilmListSystem.selectFilm("Star Wars", choosenList);
        // select film list by id
        var film1 = FilmListSystem.selectFilm(5, choosenList1);

        System.out.println("First Film : " + film);
        System.out.println("Second Film : " + film1);
    }
}
