package com.company.Entities;

public class Duration
{
    public static final Duration Zero = new Duration(0, 0, 0);


    private final int hours;
    private final int minutes;
    private final int seconds;


    public Duration(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours()
    {
        return hours;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public int getSeconds()
    {
        return seconds;
    }

    @Override
    public String toString()
    {
        return hours + ":" + minutes + ":" + seconds;
    }
}
