package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {

        //Засекаем время начала
        long launched_at = System.currentTimeMillis();

        //Готовимся к логированию
        Logger logger = LoggerFactory.getLogger(Main.class);





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


}


