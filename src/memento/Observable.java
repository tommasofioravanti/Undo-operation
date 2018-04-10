/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;

/**
 *
 * @author tommaso
 */
public abstract class Observable {
    private ArrayList<Observer> obs;
    
    public Observable(){
        obs=new ArrayList<>();
    }
    public void attach(Observer o){
        obs.add(o);
    }
    public void detach(Observer o){
        obs.remove(o);
    }
    
    protected void Notify(){
        for (Observer o:obs)
            o.update(this);
                
    }
    public abstract Object getOriginatorState();
    public abstract void restoreMemento(Memento m,int i);
    
}
    

