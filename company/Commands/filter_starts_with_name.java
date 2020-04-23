package com.company.Commands;

import com.company.City;

import java.util.List;

public class filter_starts_with_name {

    public static void run(List<City> list, String name){

        char[] nameLetters = name.toCharArray();
        boolean cheсk = false;

        for (City city: list){
            char[] cityLetters = city.getName().toCharArray();
            for (int i = 0; i < nameLetters.length; i++){
                if (cityLetters[i] == nameLetters[i]) {
                    System.out.println(city.toString());
                    cheсk = true;
                }
            }
        }

        if (!cheсk) System.out.println("Совпадений с именем " + name + " не найдено");

    }
}
