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
    public class Frame implements Runnable{
        public static int contador = 0;
        public static double progresso = 0;
        public static int time = 9000;
        public Interface _interface;
        public Frame(Interface i){
            _interface = i;
            _interface.setProgressoFrame(progresso);
            _interface.setArmazemFrame(""+contador);
        }
        public void run(){
            try{
                while(true){
                    Thread.sleep(1);
                    if(contador < 10){
                        Thread.sleep(time);
                        contador  = contador  + 1;
                        progresso = contador * 10;
                        _interface.setProgressoFrame(progresso);
                        _interface.setArmazemFrame(""+contador);
                    }
                }
            }
            catch(Exception e){}
        }
    }
