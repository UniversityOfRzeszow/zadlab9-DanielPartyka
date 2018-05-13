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
        Scanner pobierz = new Scanner(System.in);
        
        Map<String,String> m = new HashMap<String,String>();
        
        String p;
        
        p = "x";
        
        while (p!="koniec")
        {
        System.out.println("Podaj jakies slowko");
        p = pobierz.nextLine();
        
        String sl1 = m.put("wolny pokoj","vacany");
        String sl2 = m.put("pan","lord");
        String sl3 = m.put("turniej","tournament");
        String sl4 = m.put("przysiega","swearing");
        String sl5 = m.put("kameleon","chameleon");
        String sl6 = m.put("premia","bonus");
        String sl7 = m.put("sprawny","efficient");
        String sl8 = m.put("pies","dog");
        String sl9 = m.put("kot","cat");
        String sl10 = m.put("mysz","mouse");
        String sl11 = m.put("samochod","car");
        String sl12 = m.put("blok","flat");
        String sl13 = m.put("java","java");
        String sl14 = m.put("miasto","city");
        String sl15 = m.put("polski","polish");
        String sl16 = m.put("komputer","computer");
        String sl17 = m.put("para","steam");
        String sl18 = m.put("samolot","plane");
        String sl19 = m.put("matematyka","mathematic");
        String sl20 = m.put("milosc","love");
        
        if (p=="wolny pokoj")
        {
            System.out.println("Twoje slowko to "+sl1);
        }
        if (p=="pan")
        {
            System.out.println("Twoje slowko to "+sl2);
        }
        if (p=="turniej")
        {
            System.out.println("Twoje slowko to "+sl3);
        }
        if (p=="przysiega")
        {
            System.out.println("Twoje slowko to "+sl4);
        }
        
        if (p=="kameleon")
        {
            System.out.println("Twoje slowko to "+sl5);
        }
        if (p=="premia")
        {
            System.out.println("Twoje slowko to "+sl6);
        }
        if (p=="sprawny")
        {
            System.out.println("Twoje slowko to "+sl7);
        }
        if (p=="pies")
        {
            System.out.println("Twoje slowko to "+sl8);
        }   
        if (p=="kot")
        {
            System.out.println("Twoje slowko to "+sl9);
        }
        if (p=="mysz")
        {
            System.out.println("Twoje slowko to "+sl10);
        }
        if (p=="samochod")
        {
            System.out.println("Twoje slowko to "+sl11);
        }
        if (p=="blok")
        {
            System.out.println("Twoje slowko to "+sl12);
        }
        if (p=="java")
        {
            System.out.println("Twoje slowko to "+sl13);
        }
        if (p=="miasto")
        {
            System.out.println("Twoje slowko to "+sl14);
        }
        if (p=="polski")
        {
            System.out.println("Twoje slowko to "+sl15);
        }
        if (p=="komputer")
        {
            System.out.println("Twoje slowko to "+sl16);
        }
        if (p=="para")
        {
            System.out.println("Twoje slowko to "+sl17);
        }
        if (p=="samolot")
        {
            System.out.println("Twoje slowko to "+sl18);
        }
        if (p=="matematyka")
        {
            System.out.println("Twoje slowko to "+sl19);
        }
        if (p=="milosc")
        {
            System.out.println("Twoje slowko to "+sl20);
        }
    
        }
    
    
    
    
        }
    
  
}
