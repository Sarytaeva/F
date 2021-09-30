package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String nameMunira;
        final int NUM = 27;
        String word = "age";
        nameMunira = NUM + word;
        System.out.println(nameMunira + " " + NUM + " " + word);

        if (NUM < 0) {
            System.out.println("вы сохранили отрицательное число");


        }else if (NUM >0){
            System.out.println("вы сохранили положительное число");

        } else if (NUM == 0){
            System.out.println("вы сохранили ноль");

        }
        System.out.println("введите ваше имя");
      String name;
      Scanner str = new Scanner(System.in);
      name = str.next();
      System.out.println(" привет " + name);


    }
}