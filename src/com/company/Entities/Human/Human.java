package com.company.Entities.Human;

import com.company.Enums.Gender;

public abstract class Human
{
    private String name;
    private int age;
    private Gender gender;


    protected Human(String name, int age, Gender gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Gender getGender()
    {
        return this.gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    @Override
    public String toString()
    {
        return this.name + " (" + this.age + ")";
    }
}
