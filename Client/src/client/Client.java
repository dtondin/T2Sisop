package client;



import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import server.InterfaceMetodos;

//import javax.swing.JOptionPane;

public class Client {

    //private static ClienteGUI frame;
    private static InterfaceMetodos serv;

    public static void main(String[] args) {
        Client gui = new Client();
        System.out.println("Cliente iniciando...");
        Coonecta();
        //frame = new ClienteGUI(gui);
        //frame.setVisible(true);

    }

    public static void Coonecta() {
        try {
            serv = (InterfaceMetodos) Naming.lookup("//127.0.0.1:5555/jujuba");
            System.out.println("cliente conectado ");
            
            int result = serv.soma(5, 8);
            System.out.println("Somou: " + result);

                
            //JOptionPane.showMessageDialog(null, "cliente conectado ");
        } catch (MalformedURLException e) {
            System.out.println("cliente MalformedURLException ");
            //JOptionPane.showMessageDialog(null, "cliente MalformedURLException ");
            e.printStackTrace();
        } catch (RemoteException e) {
            System.out.println("cliente RemoteException ");
            //JOptionPane.showMessageDialog(null, "cliente RemoteException ");
            e.printStackTrace();
        } catch (NotBoundException e) {
            System.out.println("cliente NotBoundException ");
            //JOptionPane.showMessageDialog(null, "cliente NotBoundException ");
            e.printStackTrace();
        }
    }

//    public void setTeste(String gui) {
//        try {
//            serv.setArea(gui);
//        } catch (RemoteException e) {
//            //JOptionPane.showMessageDialog(null, "A String não foi.");
//            System.out.println("A String não foi.");
//            e.printStackTrace();
//        }
//
//    }

}