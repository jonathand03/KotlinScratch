package Client;

import ClientInfo.ClientInfo;


public class Client {
    public enum parameterType{NAME,AGE,ID,MONEY,ADDRESS};
    private long ID;
    private ClientInfo MyInfo;

    public void setClientInfo(ClientInfo Info){
        this.MyInfo = Info;
    }

    public void setRegisterParameters(parameterType type, String args) {
            switch (type){
                case NAME -> this.MyInfo.setName(args);
                case AGE -> this.MyInfo.setAge(Integer.parseInt(args));
                case ADDRESS -> this.MyInfo.setAddress(args);
                case ID -> this.ID = Long.parseLong(args);
            }
    }

    public String showName(){
        return this.MyInfo.getName();
    }
    public int showAge(){return this.MyInfo.getAge();}
    public  String showAddress(){return this.MyInfo.getAddress();}
}
