/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaDrones;

import static FabricaDrones.Helice.contador;
import static FabricaDrones.Helice.progresso;

/**
 *
 * @author F
 */
    
    public class Motor implements Runnable{
        public static int contador = 0;
        public static double progresso = 0;
        public static int time = 3000;
        public Interface _interface;
        public Motor(Interface i){
            _interface = i;
            _interface.setProgressoMotor((int)progresso);
            _interface.setArmazemMotor(""+contador);
        }
        public void run(){
            try{
                while(true){
                    Thread.sleep(1);
                    if(contador < 16){
                        Thread.sleep(time);
                        contador  = contador  + 1;
                        progresso = contador * 6.25;
                        _interface.setProgressoMotor((int)progresso);
                        _interface.setArmazemMotor(""+contador);
                    }
                }
            }
            catch(Exception e){}
        }
    }
