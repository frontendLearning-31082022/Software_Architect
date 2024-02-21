package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteMachineService extends Remote {
    String getStatus() throws RemoteException;
}
