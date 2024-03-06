//Lajkó Gergő
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kockadobások;

import java.util.Random;

/**
 *
 * @author LajkóGergő(SZOFT_202
 */
public class Kockadobások {
    static Random rnd = new Random();
    
    public static void main(String[] args) {
       int [] tomb = new int [12];
       int min=1;
       int max =12;
       System.out.println("dobások");
       int dobasok = rnd.nextInt(max-min+1)+min;
        for (int i = 0; i < tomb.length; i++) {
            tomb[i]=dobasok = rnd.nextInt(max-min+1)+min;
            
            System.out.print(dobasok +",");
        }
        
        
        //csilagos kiírás
       int maximum_dobas=0;
       String karakter = "*";
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] > maximum_dobas){
                maximum_dobas=tomb[i];
            }
        }
        System.out.println("");
        System.out.print("maximum dobás: ");
        System.out.println(maximum_dobas);
        
        System.out.println("kirás");
        int ennyiCsillagKell=40/maximum_dobas;
        System.out.print("ennyi csillag kell:");
        System.out.println(ennyiCsillagKell);
        
        int index =1; 
        for (int i = 0; i < tomb.length; i++) {
            int szamCsillag=tomb[i]*ennyiCsillagKell;
            System.out.print(index );
            for (int j = 0; j < szamCsillag; j++) {
                System.out.print(karakter);
            }
            System.out.println(szamCsillag+ "(db)");
            System.out.println("");
            index++;
                
                
            }
        }
        
       
    }
    

