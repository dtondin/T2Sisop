package client;



import java.io.Console;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.InterfaceMetodos;

//import javax.swing.JOptionPane;

public class Client {

    //private static ClienteGUI frame;
    private static InterfaceMetodos serv;


    private Scanner write;
    //private String opcao;
    //char operacao;
    //String opcao = Console.readLine();
    

    public static void main(String[] args) throws RemoteException {
        Client gui = new Client();
        System.out.println("Cliente iniciando...");
        Coonecta();
        Start();
        //Coonecta();
        //System.out.println("Cliente conectado...");
        //teste01();

    }
    
    public static void Start() throws RemoteException{
        String opcao;
        serv.soma(5, 15);
        //Scanner entrada = new Scanner(System.in);
        System.out.println("\nEscolha uma opção:\n");
        System.out.println("Opção 1 [CALCULADORA]");
        System.out.println("Opção 2 [METODOS (TESTE)]\n");
        Scanner entrada = new Scanner(System.in);
        opcao = entrada.nextLine();//.charAt(0);
        
        switch (opcao) {
            case "1":
                System.out.print("Escolha sua operação [+ - * / ]: ");
                int result = serv.soma(5, 15);
                System.out.println(result);
                break;                
            case "2":
                System.out.println("METODO 2");
                String result2 = serv.Metodos();
                System.out.println(result2);
                break;
            default:
                System.out.println("NEHUMA OPÇÂO CORRETA ESCOLHIDA");
                break;
        }
    }

    public static void Coonecta() {
        try {
            serv = (InterfaceMetodos) Naming.lookup("//127.0.0.1:5555/jujuba");
            System.out.println("cliente conectado ");
            
            
            
            //int result = serv.soma(5, 8);
            //System.out.println("Somou: " + result);

                
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
    
    public static void teste01(){
        
        String value;
        try {
            value = serv.Metodos();
            System.out.println("VALORES MÈTODOS: " + value);
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
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

//    private static void Metodos() {
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Escolha uma opção:\n");
//        System.out.println("<b>Opção 1</b> [CALCULADORA]\n");
//        System.out.println("<b>Opção 2</b> [OUTRO CALCULO]\n");
//        switch(opcao == 1){
//            System.out.print("Escolha sua operação [+ - * / ]: ");
//            
//        }
//    }
//    
//    private Scanner getWrite() {
//        if (write == null) {
//            write = new Scanner(System.in);
//        }
//        return write;
//    }

}