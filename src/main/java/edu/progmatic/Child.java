/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.progmatic;

/**
 *
 * @author peti
 */
public interface Child {
    /**
     * Step method is called every time GezaBa claps one.
     * @param positions - positions of every children (including this one too) BEFORE the clap.
     *                  the postion of this children can be get with positions(myIdx) <br/>
     *                  position of children doing pullup will be -1
     * @return
     */
    Step step(int[] positions);

    /**
     * Called by GezaBa at the time of positioning children in the gym
     * At the beginning of the whole simulation each children is positioned
     * at a certain line within the gym. The number of this line is the idx parm of this method.
     * The setMyIdy method will be called once during the simulation, and the idx of every
     * children will be uniq.
     * @param idx
     */
    void setMyIdx(int idx);

    /**
     * Called by Gezaba when one series of clapping is finished
     * (due to having a winner or everyone going to pullup without anyone winning, or
     * reaching the 100 clap limit).<br/>
     * position of children doing pullup will be -1
     * @param positions- positions of every children (including this one too) at finishing one round.
     *      *                  the postion of this children can be get with positions(myIdx) <br/>
     *      *                  position of children doing pullup will be -1
     */
    void finished(int[] positions);
}
