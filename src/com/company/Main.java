package com.company;

import com.company.Entities.*;
import com.company.Entities.Human.*;
import com.company.Enums.*;
import com.company.Helpers.Console;
import com.company.Systems.*;

public class Main {

    public static void main(String[] args)
    {
        var service = startService();

        var list = Console.selectFilmList(service);

        var film = Console.selectFilm(list);

        FilmSystem.showDetails(film);
    }

    private static PuhuTV startService()
    {
        var service = new PuhuTV();

        var foreignFilms = new FilmList(0, "Foreign Films");
        var turkFilms = new FilmList(1, "Turk Films");

        PuhuTVSystem.addFilmList(foreignFilms, service);
        PuhuTVSystem.addFilmList(turkFilms, service);


        var description =
                """
                In the near future, North America weakened and collapsed due to drought and subsequent fires and famines;
                It left its place to a country called Panem, which consists of a capital and 12 states.
                """;

        FilmCategory[] categories =
                {
                        FilmCategory.ACTION,
                        FilmCategory.ADVENTURE,
                        FilmCategory.DRAMA,
                        FilmCategory.SCIENCE_FICTION
                };

        Language[] languages =
                {
                        Language.TURKISH,
                        Language.ENGLISH
                };

        int year = 2012;

        var duration = new Duration(2, 22);

        var director = new Director("Gary Ross", 65, Gender.MALE);

        Actor[] actors =
                {
                        new Actor("Jennifer Lawrence", 31, Gender.FEMALE),
                        new Actor("Josh Hutcherson", 29, Gender.MALE),
                        new Actor("Liam Hemsworth", 32, Gender.MALE),
                        new Actor("Woody Harrelson", 60, Gender.MALE),
                        new Actor("Elizabeth Banks", 48, Gender.FEMALE),
                        new Actor("Willow Shields", 21, Gender.FEMALE)
                };


        var film = new Film(0, "Hunger Games", description, categories, languages, year, duration, director, actors);

        FilmListSystem.addFilm(film, foreignFilms);



        var description1 =
                """
                This time our transporter is hired by three seductive women for a bank robbery,
                but he's facing a tough Russian mafia and they won't be able to get what they want right away.
                The last film of the Transporter series, which has been going on since 2008, is pleasing for those who follow the series.
                """;

        FilmCategory[] categories1 =
                {
                        FilmCategory.ACTION,
                        FilmCategory.ADVENTURE,
                };

        Language[] languages1 =
                {
                        Language.TURKISH,
                        Language.ENGLISH,
                        Language.RUSSIAN
                };

        int year1 = 2008;

        var duration1 = new Duration(1, 44);

        var director1 = new Director("Olivier Megaton", 56, Gender.MALE);

        Actor[] actors1 =
                {
                        new Actor("Jason Statham", 54, Gender.MALE),
                        new Actor("Natalya Rudakova", 37, Gender.FEMALE),
                        new Actor("Robert Knepper", 62, Gender.MALE),
                        new Actor("David Atrakchi", 44, Gender.MALE)
                };


        var film1 = new Film(1, "Transporter 3", description1, categories1, languages1, year1, duration1, director1, actors1);

        FilmListSystem.addFilm(film1, foreignFilms);



        var description2 =
                """
                R??fk?? ba??l??k paras?? biriktirmek i??in gitti??i Almanya'dan d??nd??????nde b??y??k bir s??rpriz ile kar????la????r.
                Yavuklusunun babas?? ba??l??k paras??na zam yapm????, ??len babas??ndan kalan b??t??n mallar??n ??zerine de bak??c??s?? oturmu??tur.
                """;

        FilmCategory[] categories2 =
                {
                        FilmCategory.COMEDY
                };

        Language[] languages2 =
                {
                        Language.TURKISH
                };

        int year2 = 1981;

        var duration2 = new Duration(1, 35);

        var director2 = new Director("Natuk Baytan", 61, Gender.MALE);

        Actor[] actors2 =
                {
                        new Actor("Kemal Sunal", 55, Gender.MALE),
                        new Actor("Fatma ??lk?? ??zen", 44, Gender.FEMALE),
                        new Actor("Ali ??en", 70, Gender.MALE),
                        new Actor("Turgut ??zatay", 75, Gender.MALE),
                        new Actor("Reha Yurdakul", 62, Gender.MALE),
                        new Actor("Nizam Erg??den", 72, Gender.MALE)
                };


        var film2 = new Film(2, "???? Ka????t????", description2, categories2, languages2, year2, duration2, director2, actors2);

        FilmListSystem.addFilm(film2, turkFilms);



        var description3 =
                """
                D??rt ??ocuklu ve be??incisine de kans?? hamile olan dar gelirli ??brahim (??ener ??en),
                limon sat??c??l??????, bula????k????l??k gibi ek i??ler yapmas??na kar????l??k yine de ailesini doyuramaz.
                Yorgunluk ve bunal??m giderek ruhi dengesini bozar.
                """;

        FilmCategory[] categories3 =
                {
                        FilmCategory.COMEDY,
                        FilmCategory.DRAMA
                };

        Language[] languages3 =
                {
                        Language.TURKISH
                };

        int year3 = 1985;

        var duration3 = new Duration(1, 19);

        var director3 = new Director("Ba??ar Sabuncu", 72, Gender.MALE);

        Actor[] actors3 =
                {
                        new Actor("??ener ??en", 80, Gender.MALE),
                        new Actor("Nilg??n Ak??ao??lu", 67, Gender.MALE),
                        new Actor("Bur??in Terzio??lu", 42, Gender.FEMALE),
                        new Actor("Pekcan Ko??ar", 69, Gender.MALE),
                        new Actor("Zihni K??????men", 67, Gender.MALE),
                        new Actor("Salih Kalyon", 76, Gender.MALE)
                };


        var film3 = new Film(3, "????plak Vatanda??", description3, categories3, languages3, year3, duration3, director3, actors3);

        FilmListSystem.addFilm(film3, turkFilms);

        return service;
    }
}
