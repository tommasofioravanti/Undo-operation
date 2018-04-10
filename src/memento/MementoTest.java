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
public class MementoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caretaker caretaker=new Caretaker();
        Originator o = new Originator();
        Monitor m =new Monitor();
        o.attach(m);
        o.setOriginatorState(" ");
        caretaker.setMemento(o.createMemento());
        o.setOriginatorState("A");
        caretaker.setMemento(o.createMemento()); 
        o.setOriginatorState("AB");
        caretaker.setMemento(o.createMemento());
        o.setOriginatorState("ABC");
        o.restoreMemento(caretaker.getMemento(),2);
        o.restoreMemento(caretaker.getMemento(),1);
        o.restoreMemento(caretaker.getMemento(), 0);
        
    }
    
}
