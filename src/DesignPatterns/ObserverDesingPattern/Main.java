package DesignPatterns.ObserverDesingPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        YouTubeChannel channel = new YouTubeChannel();

        Subscriber aman = new Subscriber("Aman");

        channel.subscribe(aman);

        channel.newVideoUploaded("Learn Design Pattern");

        //to automate
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            System.out.println("Press 1 to upload a video");
            System.out.println("Press 2 to create new subscribers");
            System.out.println("Press 3 to exit");

            int c = Integer.parseInt(br.readLine());

            if(c == 1){

                System.out.println("Enter video title");
                String title = br.readLine();
                channel.newVideoUploaded(title);

            } else if(c == 2){

                System.out.println("Enter name of subscriber: ");
                String subName = br.readLine();
                new Subscriber(subName);
                Subscriber subscriber = new Subscriber(subName);
                channel.subscribe(subscriber);

            } else if(c == 3){

                System.out.println("Thank you");
                break;

            } else{

                System.out.println("Wrong input");
            }
        }
    }

}
