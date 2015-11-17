package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.InterfaceMetodos;

public class Client {

    private static InterfaceMetodos serv;
    
    public static void main(String[] args) throws RemoteException {
        Client gui = new Client();
        System.out.println("Cliente iniciando...");
        Conection();
        StartMetodos();
    }
    
     public static void Conection() {
        try {
            serv = (InterfaceMetodos) Naming.lookup("//127.0.0.1:5555/jujuba");
            System.out.println("Cliente conectado!\n");
        } catch (MalformedURLException e) {
            System.out.println("Cliente MalformedURLException ");
        } catch (RemoteException e) {
            System.out.println("Cliente RemoteException ");
        } catch (NotBoundException e) {
            System.out.println("Cliente NotBoundException ");
        }
    }
     
    public static void StartMetodos() throws RemoteException{
        String opcao;
        System.out.println("Escolha uma opção:\n");
        System.out.println("Opção 1 [CALCULADORA]");
        System.out.println("Opção 2 [FATORIAL]\n");
        Scanner in = new Scanner(System.in);
        opcao = in.nextLine();
        
        switch (opcao) {
            case "1":
                calculadora();
                break;                
            case "2":
                double valor;
                Scanner inFatorial = new Scanner(System.in);
                System.out.println("Entre com o valor do fatorial desejado: \n");
                valor = inFatorial.nextDouble();
                Double result = serv.fatorial(valor);
                System.out.println(result);
                break;
            default:
                System.out.println("NENHUMA OPÇÂO CORRETA ESCOLHIDA");
                break;
        }
    }
        
    public static void calculadora() throws RemoteException{        
        String opcao;
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Entre com o primeiro número: ");
        num1 = in.nextInt();
        System.out.print("Escolha sua operação [+ - * / ]: ");
        opcao = in.next();
        System.out.print("Entre com o segundo número: ");
        num2 = in.nextInt();
        switch (opcao) {
            case "+":
                System.out.print("\nResultado SOMA: "); 
                System.out.println(serv.soma(num1, num2));
                break;                
            case "-":
                System.out.println("\nResultado SUBTRAÇÃO: ");
                System.out.println(serv.subtracao(num1, num2));
                break;
            case "*":
                System.out.print("\nResultado MULTIPLICAÇÃO: ");
                System.out.println(serv.multiplicacao(num1, num2));
                break;                
            case "/":
                System.out.println("\nResultado DIVISÃO: ");
                System.out.println(serv.divisao(num1, num2));
                break;
            default:
                System.out.println("NENHUMA OPÇÂO CORRETA ESCOLHIDA");
                break;
        }
    }
}