package com.github.aleandrenavarro.spotlesssample.idea;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }


    public static class PersonBuilder {
        private String firstName;
        private String middleName;
        private String lastName;

        PersonBuilder() {
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person build() {
            return new Person(firstName, middleName, lastName);
        }

        public String toString() {
            return "Person.PersonBuilder(firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName + ")";
        }
    }
}
