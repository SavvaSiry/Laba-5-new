package com.company.Commands;

import com.company.City;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Update {

    public static void update(List<City> list) throws IOException {
        System.out.print("Введите значение id обекта, который желаете исправить: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Integer value = Integer.parseInt(reader.readLine());
            for (City city: list){
                if (value.equals(city.getId())){
                    list.remove(city);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Значение не корректно");
        }
        Add.add(list);
    }
}
