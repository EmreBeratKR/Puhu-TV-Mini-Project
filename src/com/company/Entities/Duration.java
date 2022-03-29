package com.company.Entities;

public class Duration
{
    public static final Duration Zero = new Duration(0, 0, 0);


    private final int hours;
    private final int minutes;
    private final int seconds;


    public Duration(int hours)
    {
        this.hours = hours;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Duration(int hours, int minutes)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = 0;
    }

    public Duration(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours()
    {
        return this.hours;
    }

    public int getMinutes()
    {
        return this.minutes;
    }

    public int getSeconds()
    {
        return this.seconds;
    }

    @Override
    public String toString()
    {
        var strHours = this.hours > 10 ? this.hours + "" : "0" + this.hours;
        var strMinutes = this.minutes > 10 ? this.minutes + "" : "0" + this.minutes;
        var strSeconds = this.seconds > 10 ? this.seconds + "" : "0" + this.seconds;

        return strHours + ":" + strMinutes + ":" + strSeconds;
    }
}
