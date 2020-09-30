package ru.sapteh;

import java.io.*;

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
        File dir = new File("C:/Java_42/Mon");
        File file= new File ("C:/Java_42/Mon/ghg.txt");
        System.out.println(dir.mkdir()? "success" : "error");
        System.out.println(dir.createNewFile()? "success" : "error");
        FileWriter fw = new FileWriter(file);
        System.out.println(personEmpty(person));
        fw.write(personEmpty(person));
        fw.close();

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
