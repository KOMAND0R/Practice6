package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    Student student[] = new Student[4];
	    student[0] = new Student("Михаил", 133);
        student[1] = new Student("Иван", 5);
        student[2] = new Student("Артём", 48);
        student[3] = new Student("Вячеслав", 36);
        output(student);
        sort(student);
        output(student);
    }

    public static void sort(Student[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length-1; j++)
            {
                if( arr[j].getIdNumber() > arr[j+1].getIdNumber() )
                {
                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void output(Student[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i].getName() + " " + arr[i].getIdNumber());
        }
    }

}
