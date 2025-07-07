package DesignPatterns.PrototypeDesignPattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.68.1.1");
        networkConnection.loadData();

        System.out.println(networkConnection);

        NetworkConnection networkConnection1 = networkConnection.clone();
        System.out.println(networkConnection1);
    }
}
