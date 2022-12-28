import Client.Client;
import ClientInfo.ClientInfo;

public class Main {
    public static void main(String[] args) {
        Client Me = new Client();
        ClientInfo MyInfo = new ClientInfo(); // Could be an interface type
        Me.setClientInfo(MyInfo);

        Me.setRegisterParameters(Client.parameterType.NAME,"Jonathan");
        Me.setRegisterParameters(Client.parameterType.AGE, "27");
         Me.setRegisterParameters(Client.parameterType.ADDRESS, "Rua A, Avenida B, Numero 1");
        System.out.println(Me.showAddress());
    }
}