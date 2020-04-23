package com.company.Commands;

import com.company.City;

import java.util.List;

public class Show {
    static public void show(List<City> list){
        list.forEach(System.out::println);
    }
}
