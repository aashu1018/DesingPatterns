package DesignPatterns.BuilderDesignPattern;

public class Main {

    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setUserId("123")
                .setUserName("Shelby")
                .setEmailId("abc@gmail.com")
                .build();
        System.out.println(user);

        User user2 = User.UserBuilder
                .builder()
                .setUserId("123")
                .setUserName("Shelby")
                .setEmailId("abc@gmail.com")
                .build();
        System.out.println(user2);
    }
}
