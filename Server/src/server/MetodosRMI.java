package server;

import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList; 

public class MetodosRMI extends UnicastRemoteObject implements InterfaceMetodos { 
	
	protected MetodosRMI() throws RemoteException { 
		super(); 
	} 

	@Override
	public int soma(int a, int b) {
            return a + b;
	}

	@Override
	public int metodo2(int b){
	{ 
		return b;
	}
		
	
	}
}