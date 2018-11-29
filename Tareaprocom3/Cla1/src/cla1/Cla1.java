/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cla1;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;


import java.util.Scanner;

/**
 *
 * @author Pricila Romero RP17032
 */
public class Cla1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Scanner
        Scanner pl=new Scanner(System.in);
       //instancia de clase datos
          Datos n1= Datos.getInstance(0,0,0);
       
        
        do{  
            //menu disponible
            menu.Menu();
         System.out.println("Ingrese una opcion");
         n1.setOpcion(pl.nextInt());//leer opcion de menu
            switch(n1.getOpcion())//menu
            {
                //caso 1 torre de Hanoi
                case 1:
                        System.out.println("ingrese la cantidad de discos");
                         n1.setN(pl.nextInt());
                         System.out.println(n1.getN());
                         // la clase
                          Thanoi s;
                          s=new Thanoi();
                          //resultados
                          s.Hanoi(n1.getN(), 1, 2, 3);
                        break;
                        //simulacion forma de jugar torre de hanoi
                case 2:
                    //clase
                    Camthanoi ss=new  Camthanoi();
                    ss.Ima();
                       break; 
                       //calcular valor de pi por metodo de montecarlo
                case 3:
                    Simulacion sim = new Simulacion(5, (int) 1e6); //hilos y numero de ceros
                   System.out.println(sim.pi()); 
                    break;
            }
            System.out.println("Desea realizar otra operacion 1-si 2-no");
            n1.setRe(pl.nextInt());
        }while(n1.getRe()!=2);//repetir
    }
    
}
