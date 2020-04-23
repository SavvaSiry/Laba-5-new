package com.company.Commands;

public class Constants {

    static private int ID = -1;


    public static int getID() {
        ID += 1;
        return ID;
    }

    private final static String[] massiv = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k",
            "l", "z", "x", "c", "v", "b", "n", "m", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G",
            "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};

    public static boolean nullChecker(String string) {
        for (String s : massiv) {
            if (string.contains(s)) {
                return true;
            }
        }
        return false;
    }
    public static void breakComment(String string){
        System.out.println("Переданный вами файл - не корректен: " + string);
        System.out.println("***************************\n" +
                "Пример правильно оформленного файла.\n" +
                "***************************\n" +
                "<ListCity>\n" +
                "    <City>\n" +
                "        <name> Поле не может быть null, Строка не может быть пустой </name>\n" +
                "        <coordinates>\n" +
                "            <x> Значение поля должно быть больше -554 </x>\n" +
                "            <y> Поле не может быть null </y>\n" +
                "        </coordinates>\n" +
                "        <area> Значение поля должно быть больше 0 </area>\n" +
                "        <population> Значение поля должно быть больше 0 </population>\n" +
                "        <metersAboveSeaLevel> числовое значение </metersAboveSeaLevel>\n" +
                "        <capital> false || true </capital>\n" +
                "        <agglomeration> числовое значение </agglomeration>\n" +
                "        <climate> HUMIDSUBTROPICAL || STEPPE || TUNDRA </climate>\n" +
                "        <governor> Поле не может быть null, Строка не может быть пустой </governor>\n" +
                "    </City>\n" +
                "</ListCity>");
       System.exit(0);
    }
}

