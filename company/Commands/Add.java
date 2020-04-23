package com.company.Commands;

import com.company.City;
import com.company.Climate;
import com.company.Coordinates;
import com.company.Human;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Add {
    public static void add(List<City> list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        City city = new City();

        boolean canGo = false;

        System.out.print("Введите название города: ");
        while (!canGo) {
            String name = reader.readLine();
            if (Constants.nullChecker(name)){
                city.setName(name);
                canGo = true;
            } else System.out.print("Имя введено некоректно, попробуйте еще раз: ");
        }

        Coordinates coordinates = new Coordinates();
        System.out.print("Введите значение координаты X: ");
        while (canGo){
            String x = reader.readLine();
            try {
                coordinates.setX(Float.parseFloat(x));
                canGo = false;
            } catch (NumberFormatException e) {
                System.out.print("Вы ввели число неверно, попробуйте еще раз: ");
            }
        }

        System.out.print("Введите значение координаты Y: ");
        while (!canGo){
            String y = reader.readLine();
            try {
                coordinates.setY(Integer.valueOf(y));
                canGo = true;
            } catch (NumberFormatException e) {
                System.out.print("Вы ввели число неверно, попробуйте еще раз: ");
            }
        }

        city.setCoordinates(coordinates);

        System.out.print("Введите значегие поля area: ");
        while (canGo){
            String area = reader.readLine();
            try {
                city.setArea(Long.parseLong(area));
                canGo = false;
            } catch (NumberFormatException e) {
                System.out.print("Вы ввели число неверно, попробуйте еще раз: ");
            }
        }

        System.out.print("Введите значегие поля population: ");
        while (!canGo){
            String population = reader.readLine();
            try {
                city.setPopulation(Long.parseLong(population));
                canGo = true;
            } catch (NumberFormatException e) {
                System.out.print("Вы ввели число неверно, попробуйте еще раз: ");
            }
        }

        System.out.print("Введите значегие поля metersAboveSeaLevel: ");
        while (canGo){
            String metersAboveSeaLevel = reader.readLine();
            try {
                city.setMetersAboveSeaLevel(Double.parseDouble(metersAboveSeaLevel));
                canGo = false;
            } catch (NumberFormatException e) {
                System.out.print("Вы ввели число неверно, попробуйте еще раз: ");
            }
        }

        System.out.print("Введите значегие (true or false) поля capital: ");
        while (!canGo){
            String capital = reader.readLine();
            if (capital.equals("true") || capital.equals("false")) {
                city.setCapital(Boolean.parseBoolean(capital));
                canGo = true;
            } else {
                System.out.print("Вы ввели значение неверно, попробуйте еще раз: ");
            }
        }

        System.out.print("Введите значегие поля agglomeration: ");
        while (canGo){
            String agglomeration = reader.readLine();
            try {
                city.setAgglomeration(Long.parseLong(agglomeration));
                canGo = false;
            } catch (NumberFormatException e) {
                System.out.print("Вы ввели число неверно, попробуйте еще раз: ");
            }
        }

        System.out.print("Введите значегие (HUMIDSUBTROPICAL, STEPPE, TUNDRA) поля climate: ");
        while (!canGo){
            String climate = reader.readLine();
            if (climate.equals("HUMIDSUBTROPICAL") || climate.equals("STEPPE") || climate.equals("TUNDRA")){
                city.setClimate(Climate.valueOf(climate));
                canGo = true;
            } else System.out.print("Вы ввели значение неверно, попробуйте еще раз: ");
        }

        System.out.print("Введите имя Губернатора: ");
        Human human = new Human();
        while (canGo) {
            String name = reader.readLine();
            if (Constants.nullChecker(name)){
                human.setName(name);
                canGo = false;
            } else System.out.print("Имя введено некоректно, попробуйте еще раз: ");
        }

        city.setGovernor(human);

        list.add(city);
        list.sort(City::compareTo);
        System.out.println("Объект был добавлен");
    }
}
