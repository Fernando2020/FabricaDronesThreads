/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaDrones;

import static FabricaDrones.Motor.contador;
import static FabricaDrones.Motor.progresso;

/**
 *
 * @author F
 */
    public class PlacaControladora implements Runnable{
        public static int contador = 0;
        public static double progresso = 0;
        public static int time = 7000;
        public Interface _interface;
        public PlacaControladora(Interface i){
            _interface = i;
            _interface.setProgressoPlacaControladora((int)progresso);
            _interface.setArmazemPlacaControladora(""+contador);
        }
        public void run(){
            try{
                while(true){
                    Thread.sleep(1);
                    if(contador < 8){
                        Thread.sleep(time);
                        contador  = contador  + 1;
                        progresso = contador * 12.5;
                        _interface.setProgressoPlacaControladora((int)progresso);
                        _interface.setArmazemPlacaControladora(""+contador);
                    }
                }
            }
            catch(Exception e){}
        }
    }
