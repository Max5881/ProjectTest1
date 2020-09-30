package ru.sapteh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args)throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя:");
        String name = reader.readLine();
        System.out.println("Введите возраст:");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Введите дату:");
        int date = Integer.parseInt(reader.readLine());
        Person person = new Person(name,age,date);
        System.out.println(personEmpty(person));
    }
    public static String personEmpty(Person p){
        String err="";
        if(p.getName().isEmpty())err +="Имя не заполнено\n";
        if (p.getAge()==0)err +="Возраст не заполнен\n";
        if (p.getDate()==0)err +="Дата не заполнена";
        if(!err.isEmpty())return err;
        return "Объект" + p.getClass()+" Инициализирован\n"+p.toString();
    }
}
