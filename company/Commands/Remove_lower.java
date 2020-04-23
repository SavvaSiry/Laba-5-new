package com.company.Commands;

import com.company.City;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Remove_lower {

    static public void remove_lower(List<City> list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите название поля по которому вы хотите исключить объекты: ");
        String key = reader.readLine();
        System.out.print("Введите число по кторому будет проводиться сравнение: ");
        String valueString = reader.readLine();

        switch (key) {
            case "area": {
                try {
                    Long value = Long.parseLong(valueString);
                    for (City city: list){
                        if (city.getArea() < value){
                            list.remove(city);
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Значение введено неправильно");
                }
            }
            break;
            case "population": {
                try {
                    Long value = Long.parseLong(valueString);
                    for (City city: list){
                        if (city.getPopulation() < value){
                            list.remove(city);
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Значение введено неправильно");
                }
            }
            break;
            case "metersAboveSeaLevel": {
                try {
                    Double value = Double.parseDouble(valueString);
                    for (City city: list){
                        if (city.getMetersAboveSeaLevel() < value){
                            list.remove(city);
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Значение введено неправильно");
                }
            }
            break;
            case "agglomeration": {
                try {
                    Long value = Long.parseLong(valueString);
                    for (City city: list){
                        if (city.getAgglomeration() < value){
                            list.remove(city);
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Значение введено неправильно");
                }
            }
            break;
            default:
                System.out.println("Поля по кторомы можно проводить сравнения:\n\"area\", \"population\", \"metersAboveSeaLevel\", \"agglomeration\"");
        }
    }
}