package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements InterfaceMetodos {
    
    private static Server server;

    protected Server() throws RemoteException {
        super();
    }

    public static void main(String[] args) {
        try {
            server = new Server();
            LocateRegistry.createRegistry(5555);
            startServerConnection();
        } catch (RemoteException e) {
            System.out.println("não inicia frame: " + e);
        }
    }

    public static void startServerConnection() throws RemoteException {
        try {
            Naming.rebind("//127.0.0.1:5555/jujuba", server);
            System.out.println("Server iniciou .. \\o/ .. Toca ficha e liga liga o cliente ae");
        } catch (MalformedURLException | RemoteException dsa) {
            System.out.println("Server não iniciou: " + dsa);
        }
    }

    @Override
    public int soma(int a, int b) throws RemoteException {
        return a + b;
    }
    
    @Override
    public int subtracao(int a, int b) throws RemoteException {
        return a - b;
    }
    
    @Override
    public int multiplicacao(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int divisao(int a, int b) throws RemoteException {
        return a / b;
    }
    
    @Override
    public double fatorial(double a) throws RemoteException {
        if (a < 0) {
            throw new IllegalArgumentException("ERROR -> NUMERO NEGATIVO");
        }
        double resultado = 1;
        if (a != 0) {
            for (int i = 2; i <= a; i++) {
                resultado *= i;
            }
        }
        return resultado;
    }    
}
