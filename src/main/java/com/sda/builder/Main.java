package com.sda.builder;

public class Main {
    public static void main(String[] args) {

        User user =
                User.UserBuilder.anUser()
                .age(21)
                .email("lukasz@lukasz.com")
                .build();




        System.out.println(user.getAge());


    }
}
