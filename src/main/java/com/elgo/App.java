package com.elgo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {   ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(123);
        a1.add(231);
        System.out.println( a1 );
        Personnel p = new PersonnelBuilder("DIEYE", "Gora", 1).setDateDeNaissance(2020,9,19).getPersonnel();
        System.out.println(p);
    }
}
