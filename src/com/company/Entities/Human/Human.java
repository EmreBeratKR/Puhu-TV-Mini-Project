package com.company.Entities.Human;

import com.company.Enums.Gender;

public abstract class Human
{
    private final String name;
    private final int age;
    private final Gender gender;


    protected Human(String name, int age, Gender gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge()
    {
        return this.age;
    }

    public Gender getGender()
    {
        return this.gender;
    }

    @Override
    public String toString()
    {
        return this.name + " (" + this.age + ")";
    }
}
