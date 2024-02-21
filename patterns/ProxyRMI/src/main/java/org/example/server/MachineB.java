package org.example.server;

import org.example.RemoteMachineService;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MachineB extends UnicastRemoteObject implements Runnable, Serializable, RemoteMachineService {
    int value=0;
    private static final long serialVersionUID = 1L;

    public MachineB() throws RemoteException {
        super();
    }

   void makeWork(){
       this.value+=10;
       System.out.println("MachineB change status to "+this.value);
   }

    @Override
    public void run() {
       while (true){
           try {
               Thread.sleep(4000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           makeWork();
       }
    }

    @Override
    public String getStatus() {
        return String.valueOf(this.value);
    }

}
