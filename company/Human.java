package com.company;

import com.company.Commands.Constants;

public class Human {
    private String name; //Поле не может быть null, Строка не может быть пустой

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Constants.nullChecker(name)) {
            this.name = name;
        } else Constants.breakComment("Пустая строка в поле governer");
    }
}