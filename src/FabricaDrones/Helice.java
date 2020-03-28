/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaDrones;

import static FabricaDrones.Frame.contador;
import static FabricaDrones.Frame.progresso;

/**
 *
 * @author F
 */
    public class Helice implements Runnable{
        public static int contador = 0;
        public static double progresso = 0;
        public static int time = 2000;
        public Interface _interface;
        public Helice(Interface i){
            _interface = i;
            _interface.setProgressoHelice((int)progresso);
            _interface.setArmazemHelice(""+contador);
        }
        public void run(){
            try{
                while(true){
                    Thread.sleep(1);
                    if(contador < 80){
                        Thread.sleep(time);
                        contador  = contador  + 1;
                        progresso = contador * 1.25;
                        _interface.setProgressoHelice((int)progresso);
                        _interface.setArmazemHelice(""+contador);
                    }
                }
            }
            catch(Exception e){}
        }
    }
