package com.devix.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> colores = Arrays.asList("A","B","C","D","E");
        Iterator iterator;
        iterator = colores.iterator();

        while (iterator.hasNext()){
            String color = (String) iterator.next();
            System.out.println("El color es " + color);
        }
    }
}
