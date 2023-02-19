package com.github.aleandrenavarro.spotlesssample;

import com.github.aleandrenavarro.spotlesssample.idea.Person;

public class SpotlessSampleApplication {

    public static void main(String[] args) {
        System.out.println("hello world");
        Person.builder()
            .firstName("Alexandre")
            .middleName("Jean Denis")
            .lastName("Navarro")
            .build();
    }

}
