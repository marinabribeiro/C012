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
public class IsnpecaoRobosSemaforo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FilaInspecaoRobos fila = new FilaInspecaoRobos();
        
        Thread[] thread = new Thread[3];
        for (int i = 0; i<3; i++){
        thread[i] = new Thread(
        new ProcessoInspecaoRobos(fila));
        }
        
        for (int i = 0; i<3; i++){
        thread[i].start();
        }
        // TODO code application logic here
    }
    
}
