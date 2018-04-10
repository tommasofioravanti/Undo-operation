/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author tommaso
 */
public class Monitor implements Observer{
    private Object monitorState;
    public void update(Observable o){
        monitorState=o.getOriginatorState();
        System.out.println("Monitor sees state " + monitorState + " after restoring");
    }
    
}
