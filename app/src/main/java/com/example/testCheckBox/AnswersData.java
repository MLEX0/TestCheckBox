package com.example.testCheckBox;

import java.io.Serializable;
//Этот клас представляет собой хранилище всех ответов, которые выбрал пользователь...
//Знаю, что можно тупо передавать ответы через Intent с активити на активити,
//но я привык делать так на C# и не знаю насколько в Java это правильно или не правильно, так что как-то так
public class AnswersData implements Serializable {
    private static int answ1;
    private static int answ2;
    private static int answ3;
    private static int answ4;
    private static int answ5;
    private static int answ6;

    public static int getAnsw1()
    {
        int answ1 = AnswersData.answ1;
        return answ1;
    }

    public static int getAnsw2()
    {
        int answ2 = AnswersData.answ2;
        return answ2;
    }

    public static int getAnsw3()
    {
        int answ3 =  AnswersData.answ3;
        return answ3;
    }

    public static int getAnsw4()
    {
        int answ4 =  AnswersData.answ4;
        return answ4;
    }

    public static int getAnsw5()
    {
        int answ5 =  AnswersData.answ5;
        return answ5;
    }

    public static int getAnsw6()
    {
        int answ6 =  AnswersData.answ6;
        return answ6;
    }

    public static void setAnsw1(int setansw1)
    {
        AnswersData.answ1 = setansw1;
    }

    public static void setAnsw2(int setansw2)
    {
        AnswersData.answ2= setansw2;
    }

    public static void setAnsw3(int setansw3)
    {
        AnswersData.answ3 = setansw3;
    }

    public static void setAnsw4(int setansw4)
    {
        AnswersData.answ4 = setansw4;
    }

    public static void setAnsw5(int setansw5)
    {
        AnswersData.answ5 = setansw5;
    }

    public static void setAnsw6(int setansw6)
    {
        AnswersData.answ6 = setansw6;
    }


}
