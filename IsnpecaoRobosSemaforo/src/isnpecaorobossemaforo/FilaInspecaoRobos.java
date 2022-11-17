/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isnpecaorobossemaforo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Marinaa
 */
public class FilaInspecaoRobos {
    
    public void inspecionarSemSemaforo() {
        System.out.println("Robo da " + Thread.currentThread().getName()+ " esta sendo inspecionado!");
        System.out.println("Robo da " + Thread.currentThread().getName()+ " inspecionado com sucesso");
    }
    
    Semaphore semaforo = new Semaphore(1);
    
    public void inspecionarComSemaforo(){
    
        try {
        
            semaforo.acquire();
            System.out.println("Robo da " + Thread.currentThread().getName() + " esta sendo isnpecionado!");
        }catch (InterruptedException ex){}
        finally {
            System.out.println("Robo da " + Thread.currentThread().getName() + " inspecionado com sucesso!");
            semaforo.release();
        }
    }
    
    //criando o semaforo
    
}
