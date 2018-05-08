/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;
import java.util.*;
/**
 *
 * @author student
 */
public class Lab9 {

   //Zad1
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int[] tablica = new int[100];
        for (int i=0;i<100;i++)
        {
            tablica[i] = r.nextInt(100);
        }
        Arrays.sort(tablica);
        System.out.println("Zadanie 1");
        for (int j=0;j<100;j++)
        {
            System.out.println(tablica[j]);
        }
    //Zad2
        
        System.out.println("---------------");    
        System.out.println("Teraz Zadanie 2");
        int[] tablica1 = new int[100];
        for (int i=0;i<100;i++)
        {
            tablica1[i] = r.nextInt(100);
        }
        TreeSet ts1 = new TreeSet();
        for (int i=0;i<100;i++)
        {
            ts1.add(tablica1[i]);
        }
        for (int i=0;i<100;i++)
        {
            System.out.println(tablica1[i]);
        }
       //Zad3 
        Samochody s1 = new Samochody("BMW","E90",320,185000);
        Samochody s2 = new Samochody("BMW","E46",240,40000);
        Samochody s3 = new Samochody("BMW","E39",200,12500);
        Samochody s4 = new Samochody("BMW","E36",170,2200);
        Samochody s5 = new Samochody("BMW","E32",150,1500);
        
        //Lista 
        List l1 = new ArrayList();
        l1.add(s1.toString());
        l1.add(s2.toString());
        l1.add(s3.toString());
        l1.add(s4.toString());
        l1.add(s5.toString());
        
        System.out.println("Kolekcja aut");
        System.out.println("\t"+l1);
    }
    
  
}
