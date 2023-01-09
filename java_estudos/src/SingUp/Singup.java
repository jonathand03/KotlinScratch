package SingUp;

import Client.Client;

import java.util.Scanner;

public class Singup {
    private String registerMessage          = "Bem - Vindo ao Centro de Cadastro";
    private String registerGetNameMessage   = "Por favor, digite seu nome: ";
    private String registerGetAgeMessage    = "Por favor, digite sua idade: ";
    private String regigsterGetAddress      = "Por favor, digite seu endereço";
    private String teste = "Teste";

    public void register(){
            System.out.println(this.registerMessage);
            Scanner readKeyBoard = new Scanner(System.in);
            System.out.println(this.registerGetNameMessage);
            String getRegisterName = readKeyBoard.nextLine();
            if(getRegisterName != null){
                Client newClient = new Client();
            }
    }
}
