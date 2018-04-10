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
public class Memento {
    private ArrayList <Object> mementoState;
    private Memento(){
        mementoState=new ArrayList<>();
    };
    private static Memento ISTANCE=null;
    public static Memento getIstance(){
        if(ISTANCE==null)
            ISTANCE=new Memento();
        return ISTANCE;
    }
    public Object getMementoState(int i){
        return mementoState.get(i);
    }
    public void setMementoState(Object originatorState){
        mementoState.add(originatorState);
    }
    
}
