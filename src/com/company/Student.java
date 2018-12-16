package com.company;

public class Student
{
    private String name;
    private int idNumber;

    Student(String n, int i)
    {
        this.name = n;
        this.idNumber = i;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }

    public String getName()
    {
        return name;
    }
    public int getIdNumber()
    {
        return idNumber;
    }
}
