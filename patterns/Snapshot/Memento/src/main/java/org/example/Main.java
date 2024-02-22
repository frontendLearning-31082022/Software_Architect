package org.example;

import org.example.increaser.Increazer;

public class Main {
    public static void main(String[] args) {
        Increazer increazer =new Increazer();
        CareTaker careTaker=new CareTaker(increazer);

        int val=increazer.increase();
        careTaker.makeSnapshot("1");
        assert val==1;
        val=increazer.increase();
        careTaker.makeSnapshot("2");
        assert val==2;
        val=increazer.increase();
        careTaker.makeSnapshot("3");
        assert val==3;

        careTaker.undo();
        careTaker.undo();
        careTaker.undo();

        val=increazer.increase();
        assert val==2;
    }
}