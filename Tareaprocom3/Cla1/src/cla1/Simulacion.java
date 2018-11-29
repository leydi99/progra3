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
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author LAPTOP
 */
public class Simulacion {
    //constructor
    public Simulacion(int cantHilos,int cantI) {
        this.cantHilos = cantHilos;
        cantIter = cantI;
        hilos = new LinkedList();
        threadPool = Executors.newFixedThreadPool(cantHilos);
        iniciarProcesos();
    }
    //iniciar proceso 
    public void iniciarProcesos(){
        Random rnd = new Random();
        for(int i = 0; i < cantHilos; i++)
            //un mellon entre la cantidad de hilo
            hilos.add(new Subpromontecarlo(rnd,cantIter/cantHilos)); //Lo que le tocara a cada hilo
    }
    //para cada proceso de hilo se ejecutara
    public void iniciarTodos(){
        for(Subpromontecarlo s : hilos){
            threadPool.execute(s);
        }
        threadPool.shutdown();    
    }
    //calcular pi
    public double pi(){
        iniciarTodos();
        long totalDentro = 0;long totalTotal = 0;
            while (!threadPool.isTerminated());///Barrera
            for (Subpromontecarlo t : hilos) {
                totalDentro += t.getCantidadDentro();
                totalTotal += t.getCantidadTotal();
            }
            return 4.0 * totalDentro / totalTotal;
    }
      //atributos
    public int cantHilos = 0;
    public int cantIter = 0;
    public LinkedList<Subpromontecarlo> hilos;
    public ExecutorService threadPool;

    
   
    
}

