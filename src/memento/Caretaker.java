/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;
import java.util.ArrayList;
import memento.Memento;
/**
 *
 * @author tommaso
 */
public class Caretaker {
    private Memento memento;
    public void setMemento(Memento m){
        memento=m;
    }
    public Memento getMemento(){
        return memento;
    }
}
