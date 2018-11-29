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
public class Datos {
  private int n;
  private int opcion;
 int re;
 
    private static Datos Datos;//objeto, constructor
    //parametros
    private Datos(int n,int opcion,int re){
        
        this.n=n;
       this.opcion=opcion;
       this.re=re;
        
    }
//metodos set y get 
    public int getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

   
    //validamos que no este nulo
    public static Datos getInstance(int n,int opcion,int re){
        if( Datos == null)
        {
           Datos= new Datos(n,opcion,re);
        }
        else{
            
        }
        return Datos;
    }
    
}
