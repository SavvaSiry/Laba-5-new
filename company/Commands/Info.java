package com.company.Commands;

import com.company.City;
import java.time.LocalDateTime;
import java.util.List;

public class Info {

    private static java.time.LocalDateTime creationDate;

    public static void info(List<City> list){
        System.out.println("Тип колекции " + list.getClass());
        System.out.println("Количество объектов " + list.size());
        System.out.println("Время инициализации " + creationDate.toString());
    }

    public static void setCreationDate(LocalDateTime date) {
        creationDate = date;
    }
}