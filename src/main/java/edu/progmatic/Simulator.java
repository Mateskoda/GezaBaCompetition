/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.progmatic;



import edu.progmatic.children.DullChild;
import edu.progmatic.children.RandomChild;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author peti
 */
public class Simulator {
    
    private static final List<Class<? extends Child>> CLASSES = new ArrayList<>();
    private static final GezaBa gb = new GezaBa();
    int a = 0;
    
    static{
        CLASSES.add(DullChild.class);
        CLASSES.add(RandomChild.class);
    }
    
    public static void main(String[] args) {
        
        try {
            Logger.doLog = false;
            addChildren(2);
            gb.startGame();
            for (int i = 0; i < 10000; i++) {
                gb.playGame();
            }
            gb.printResults();
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        
    }
    
    private static void addChildren(int nrOfInstancesPerClass) throws InstantiationException, IllegalAccessException {
        for (Class<? extends Child> classe : CLASSES) {
            for(int i=0; i<nrOfInstancesPerClass; i++){
                Child ch = classe.newInstance();
                gb.addChild(ch);
            }          
        }
    }
}
