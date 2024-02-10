/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fonksiyon;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class fonksiyon {

    /**
     * @param args the command line arguments
     */
    static int f(int x){
        return 3*x+6;
    }
    static int g(int y){
        return 5*y+6;
    }
    public static void main(String[] args) {
       Scanner klavye = new Scanner(System.in);
        System.out.println("bir değer giriniz:(y)");
        int y =klavye.nextInt();
        System.out.println("bir değer giriniz:(x)");
        int x =klavye.nextInt();

        System.out.println("f("+x+")+g("+y+")'nin degeri="+(f(x)+g(y)));
       
        
            
    
               
     
         
         
     }
     
}
