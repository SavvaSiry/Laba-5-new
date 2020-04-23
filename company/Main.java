package com.company;

import com.company.Commands.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, TransformerException {

        try {
            String nameOfFile = args[0];
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            LinkedList<City> cityList = ParserXML.parseXML(nameOfFile);

            String stringInitial;
            String stringBuffer;

            while (true){

                int k = 1;
                String argument = "";
                String stringForComparison = "";
                    stringInitial = reader.readLine();
                    if (stringInitial.equals("exit")) break;


                //отсечение у введеных строк всех символов до первого знака пробел
                stringBuffer = stringInitial;

                char[] stringbufferToArray = stringBuffer.toCharArray(); //разделение посимвольно строки на массив из 'элементов чар
                for (int i = 0; i < stringbufferToArray.length; i++){
                    String valueOfchar = String.valueOf(stringbufferToArray[i]); //преобразование символа чар в строку
                    if (valueOfchar.equals(" ")){ //сравнение на пробел, для отсечения ненужной части строки
                        break;
                    }
                    stringForComparison += valueOfchar; //посимвольно собираем строку пока не встретиться первый пробел
                    k+=1;
                }
                for (int i = k; i < stringbufferToArray.length; i++){
                    argument += String.valueOf(stringbufferToArray[i]);
                }

    //            System.out.println(stringForComparison);
    //            System.out.println(argument);

                switch (stringForComparison){ //передаем оператору swith нашу собранную строку на сравение с допустимыми командами
                    case ("help"):
                        Help.help();
                        break;
                    case ("info"):
                        Info.info(cityList);
                        break;
                    case ("show"):
                        Show.show(cityList);
                        break;
                    case ("add"):
                        Add.add(cityList);
                        break;
                    case ("update"):
                        Update.update(cityList);
                        break;
                    case ("remove_by_id"):
                        try {
                            Remove_by_id.remove_by_id(cityList, Integer.parseInt(argument));
                        } catch (NumberFormatException e) {
                            System.out.println("Данные введены неправильно");
                        }
                        break;
                    case ("clear"):
                        Clear.clear(cityList);
                        break;
                    case ("save"):
                        Save.save(cityList, nameOfFile);
                        break;
                    case ("execute_script"):
                        try {
                            Execute_script.run(cityList, argument);
                        } catch (NullPointerException e) {
                            System.out.println("Не указано имя файла");
                        }
                        break;
                    case ("head"):
                        Head.head(cityList);
                        break;
                    case ("remove_greater"):
                        Remove_greater.remove_greater(cityList);
                        break;
                    case ("remove_lower"):
                        Remove_lower.remove_lower(cityList);
                        break;
                    case ("count_greater_than_meters_above_sea_level"):
                        try {
                            count_greater_than_meters_above_sea_level.run(cityList, Double.parseDouble(argument));
                        } catch (NumberFormatException e) {
                            System.out.println("Данные введены неправильно");
                        }
                        break;
                    case ("filter_starts_with_name"):
                        if (Constants.nullChecker(argument)) {
                            filter_starts_with_name.run(cityList, argument);
                        }
                        break;
                    default:
                        System.out.println("Такой команды нет, для просмотра доступных команд введите \"help\"");
                }
            }
        } catch (java.lang.NullPointerException e) {
            System.out.println("Путь к файлу указан неверно или нет прав");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Забыли передать файл");
        }
    }
}