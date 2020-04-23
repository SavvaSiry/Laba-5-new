package com.company.Commands;

import com.company.City;

import java.util.List;

public class count_greater_than_meters_above_sea_level {
    public static void run(List<City> list, Double x){
        int value = 0;
        for (City city: list){
            if (city.getMetersAboveSeaLevel() > x) value++;
        }
        System.out.println("Количество городов, высота над уровнем моря превышающие " + x + " м равна: " + value);
    }
}
