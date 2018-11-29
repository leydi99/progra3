/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cla1;

/**
 *
 * @author Pricila Romero
 */
public class Thanoi{
    //funcion que nos dira donde mover
    public void Hanoi(int n, int origen,  int auxiliar, int destino){
  if(n==1)
  System.out.println("mover disco de " + origen + " a " + destino);
  else{
     Hanoi(n-1, origen, destino, auxiliar);
     System.out.println("mover disco de "+ origen + " a " + destino);
     Hanoi(n-1, auxiliar, origen, destino);
   }
 }
    
}
