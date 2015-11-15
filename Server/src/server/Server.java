package server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Server extends UnicastRemoteObject implements InterfaceMetodos {

    //private static Tela frame;
    private static Server server;
    private int opcao;

    protected Server() throws RemoteException {
        super();

    }

    public static void main(String[] args) {
        try {
            server = new Server();
            LocateRegistry.createRegistry(5555);
            //frame = new Tela(server);
            //frame.setVisible(true);
            Inicia();
        } catch (Exception e) {
            System.out.println("não inicia frame: " + e);
            //JOptionPane.showConfirmDialog(null, "não inicia frame");
        }

    }

//    @Override
//    public String setArea(String gf) throws RemoteException {
//        frame.setAarea(gf);
//        return null;
//    }
    public static void Inicia() throws RemoteException {
        try {
            Naming.rebind("//127.0.0.1:5555/jujuba", server);
            System.out.println("Server iniciou .. :D");
            //JOptionPane.showMessageDialog(null, "server iniciou");
        } catch (Exception dsa) {
            System.out.println("Server não iniciou: " + dsa);
            //JOptionPane.showMessageDialog(null, "server não iniciou");

        }

    }

    @Override
    public int soma(int a, int b) throws RemoteException {
        int result = a + b; 
        //System.out.println("A + B: " + result);
        return result + 1000;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int metodo2(int b) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Metodos() throws RemoteException{
        //Scanner entrada = new Scanner(System.in);
//        System.out.println("Escolha uma opção:\n");
//        System.out.println("<b>Opção 1</b> [CALCULADORA]\n");
//        System.out.println("<b>Opção 2</b> [OUTRO CALCULO]\n");
//        switch (opcao) {
//            case 1:
//                System.out.print("Escolha sua operação [+ - * / ]: ");
//                break;                
//            case 2:
//                System.out.println("METODO 2");
//                break;
//            default:
//                System.out.println("NEHUMA OPÇÂO CORRETA ESCOLHIDA");
//                break;
//        }
        
        return "ALI!!";
    }


}
