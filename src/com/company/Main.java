package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {

        //Засекаем время начала
        long launched_at = System.currentTimeMillis();

        //Готовимся к логированию
        Logger logger = LoggerFactory.getLogger(Main.class);



        System.out.println(initRange(args[0]));


        //Создаем запись в журнале
        logger.info(getElapsedTime(launched_at));

    }

    public static String getElapsedTime(long launched_at)
    {

        //Рассчитываем время, затраченное на рассчтеы
        StringBuilder time_elapsed = new StringBuilder();
        time_elapsed.append("Затраченное время: ");
        time_elapsed.append(System.currentTimeMillis() - launched_at);
        time_elapsed.append("мс.");

        return time_elapsed.toString();

    }

    public static boolean initBefore(String settings)
    {

        try
        {
            Integer.parseInt(settings);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }

    }

    public static String initRange(String income)
    {

        StringBuilder Fibs = new StringBuilder();

        if (initBefore(income))
        {
            //Выводим ряд чисел Фибоначчи
            Fibs.append(getFibs(Integer.parseInt(income)));

        }
        else
        {
            Fibs.append("С входнными данными '");
            Fibs.append(income);
            Fibs.append("' невозможно произвести рассчет.");
        }

        return Fibs.toString();

    }


    public static String getFibs(int it)
    {

        StringBuilder Fibs = new StringBuilder();

        int n0 = 1;
        int n1 = 1;
        int n2;
        Fibs.append(n0+" "+n1+" ");

        for(int i = 3; i <= it ; i++){

            n2=n0+n1;

            Fibs.append(n2+" ");

            n0=n1;
            n1=n2;

        }

        return Fibs.toString();

    }


}


