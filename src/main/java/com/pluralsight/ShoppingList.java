package com.pluralsight;

public class ShoppingList{

    public static void main(String[] args){

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++){
            System.out.println("i= " + i);
        }

        doSomething();
    }

    public static void doSomething(){
        System.out.println("Doing something...");
        Toolbox.saw();
    }



}
