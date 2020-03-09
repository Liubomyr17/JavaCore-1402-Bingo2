package com.company;

/*
1402 Bingo-2
Исправь строчку ‘Cat cat = new Cat();‘ так, чтобы программа вывела «Bingo!«.

Требования:
1. Класс Cat должен реализовывать интерфейс Movable.
2. Класс Cat должен быть родителем(родительским классом) класса TomCat.
3. В переменной cat должен храниться объект который будет одновременно являться и Movable, и Cat, и Tomcat.
4. Программа должна выводить на экран: "Bingo!".


 */


public class Solution {
    public static void main(String[] args) {
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMoveable = cat instanceof Moveable;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMoveable && isTom) System.out.println("Bingo!");

    }

    interface Moveable {
    }

    static class Cat {
    }

    static class TomCat extends Cat implements Moveable {

    }
}






