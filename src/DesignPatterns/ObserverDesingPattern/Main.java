package DesignPatterns.ObserverDesingPattern;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

       NewsChannel newsChannel = new NewsChannel();

       User user1 = new User("Rahul");
       User user2 = new User("Ajay");

       newsChannel.subscribe(user1);
       newsChannel.subscribe(user2);

       newsChannel.setNews("Observer Factory Design Pattern example");
    }

}
