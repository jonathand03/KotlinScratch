package ClientInfo;

public class ClientInfo {
    private String name;
    private String address;
    private int age;
    private double money;

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }

    public int getAge(){
        return this.age;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    public String getAddress(){
        return this.address;
    }

    public void setMoney(double newMoney){
        this.money = newMoney;
    }

    public double getMoney(){
        return this.money;
    }
}
