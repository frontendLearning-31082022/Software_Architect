package org.example.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerStart {
    public static void start() throws RemoteException {
        MachineB machineB = new MachineB();
        new Thread(machineB).start();

        System.setProperty("java.security.policy", "file:" + Thread.currentThread().getContextClassLoader().getResource("server.policy").getPath());
        System.setSecurityManager(new SecurityManager());

//      RemoteMachineService stub = (MachineB) UnicastRemoteObject.exportObject(machineB, 0);

        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("MachineB", machineB);
        System.out.println("Server ready");

    }

    public static void main(String[] args) {
        try {
            ServerStart.start();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
