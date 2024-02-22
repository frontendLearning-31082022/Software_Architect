package org.example;

import org.example.increaser.Increazer;

import java.util.ArrayList;

public class CareTaker {
    Increazer increazer;
    ArrayList<IncreaserMemento>history=new ArrayList<>();

    CareTaker(Increazer increazer){
        this.increazer=increazer;
    }

    public void makeSnapshot(String name){
        history.add(increazer.createMemento(name));
    }

    public void undo(){
        this.increazer.restoreMemento(history.remove(history.size()-1));
    }
}
