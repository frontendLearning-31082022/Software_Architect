package org.example.client;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import org.example.RemoteMachineService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public Client() {
    }

    public static void start(String ip) throws RemoteException, NotBoundException, InterruptedException {
        Registry registry = LocateRegistry.getRegistry(ip,1099);
        RemoteMachineService stub = (RemoteMachineService)registry.lookup("MachineB");
        String status= stub.getStatus();

        System.out.println("State on remote machine: "+status);
        Thread.sleep(4000);
        System.out.println("State on remote machine _second: "+stub.getStatus());
    }

    public static void main(String[] args) {
        try {
            Client.start("192.168.1.45");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    /*

    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        String host = args.length < 1 ? null : args[0];



        Registry registry = LocateRegistry.getRegistry("192.168.1.45",1099);
        RemoteMachineService stub = (RemoteMachineService)registry.lookup("Hello");
        String suka2= stub.sayHello();


//        RemoteMachineService res= (RemoteMachineService) Naming.lookup("rmi://192.168.1.2/Hello");
//        RemoteMachineService res= (RemoteMachineService) Naming.lookup("rmi://192.168.1.45/Hello");

//       String suka= res.sayHello();

        try {
            Registry registry2 = LocateRegistry.getRegistry("192.168.1.2",1099);
            RemoteMachineService stub2 = (RemoteMachineService)registry.lookup("Hello");
            String response = stub.sayHello();
            System.out.println("response: " + response);
        } catch (Exception var5) {
            System.err.println("Client exception: " + var5.toString());
            var5.printStackTrace();
        }

    }

    */
}
