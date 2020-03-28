/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaDrones;

/**
 *
 * @author F
 */
    public class Bateria implements Runnable{
        public static int contador = 0;
        public static double progresso = 0;
        public static int time = 3000;
        public Interface _interface;
        public Bateria(Interface i){
            _interface = i;
            _interface.setProgressoBateria((int)progresso);
            _interface.setArmazemBateria(""+contador);
        }
        public void run(){
            try{
                while(true){
                    Thread.sleep(1);
                    if(contador < 20){
                        Thread.sleep(time);
                        contador  = contador  + 1;
                        progresso = contador * 5;
                        _interface.setProgressoBateria((int)progresso);
                        _interface.setArmazemBateria(""+contador);
                    }
                }
            }
            catch(Exception e){}
        }
    }
