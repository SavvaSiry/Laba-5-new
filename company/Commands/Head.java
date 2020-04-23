package com.company.Commands;

import com.company.City;

import java.util.List;

public class Head {
    public static void head(List<City> list){
        System.out.println(list.get(0).toString());
    }
}
