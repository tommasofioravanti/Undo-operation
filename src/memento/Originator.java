/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;
import memento.Memento;
/**
 *
 * @author tommaso
 */
public class Originator extends Observable{
    private Object originatorState;
    
    public void setOriginatorState(Object state){
        originatorState=state;
        System.out.println("Setting state to " +originatorState);
    }
    public Object getOriginatorState(){
        return originatorState;
    }
    
    public Memento createMemento(){
        Memento m = Memento.getIstance();
        m.setMementoState(originatorState);
        System.out.println("Save " +originatorState  +" in Memento");
        return m;
    }
    public void restoreMemento(Memento m,int i){
        originatorState=m.getMementoState(i);
        //System.out.println("Originator has state " +originatorState + " after restoring");
        Notify();
        
        
    }
    
}
