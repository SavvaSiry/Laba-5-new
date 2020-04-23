package com.company.Commands;

import com.company.City;
import java.util.List;

public class Remove_by_id {
    public static void remove_by_id(List<City> list, int id){
        for (City city: list){
            if (city.getId().equals(id)){
                list.remove(city);
            }
        }

        list.sort(City::compareTo);

    }
}