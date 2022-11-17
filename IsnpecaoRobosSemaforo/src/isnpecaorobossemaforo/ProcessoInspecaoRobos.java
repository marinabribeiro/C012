/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isnpecaorobossemaforo;

/**
 *
 * @author Marinaa
 */
public class ProcessoInspecaoRobos implements Runnable{
    FilaInspecaoRobos fila;

  public ProcessoInspecaoRobos(FilaInspecaoRobos f){
  
      fila = f;
  }

    @Override
    public void run() {
        
        System.out.println("Robo da " + Thread.currentThread().getName() + " pronto para ser inspecionado!");
        //fila.inspecionarSemSemaforo();
        fila.inspecionarComSemaforo();
    }
    
    
}
