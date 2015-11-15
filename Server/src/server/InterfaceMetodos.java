package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceMetodos extends Remote {

    //METODOS CALCULADORA
    public int soma(int a, int b)throws RemoteException;
    public int subtracao(int a, int b)throws RemoteException;
    public int multiplicacao(int a, int b)throws RemoteException;
    public int divisao(int a, int b)throws RemoteException;
    
    //METODOS FATORIAL
    public double fatorial(double a) throws RemoteException;
    
}
