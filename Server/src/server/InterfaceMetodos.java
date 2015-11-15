package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceMetodos extends Remote {

    //public String setArea(String gf) throws RemoteException;
    
    public int soma(int a, int b)throws RemoteException;
    public int metodo2(int b)throws RemoteException;

    public String Metodos()throws RemoteException;;

    
}
