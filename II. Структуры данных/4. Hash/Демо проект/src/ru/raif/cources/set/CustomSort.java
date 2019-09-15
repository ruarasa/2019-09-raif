package ru.raif.cources.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CustomSort {
    static class User implements Comparable<User> {

        private String firstName;
        private String lastName;
        private int salary;

        public User(String firstName, String lastName, int salary) {
            super();
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " " + salary;
        }

        @Override
        public int compareTo(User o) {
            return this.firstName.compareTo(o.firstName);
        }
    }

    public static void main(String[] args) {

        //Putting Custom Objects in Sorted Order
        Set<User> userSet = new TreeSet<User>();
        populateUser(userSet);

        System.out.println("** Users based on first Name **");
        System.out.println(userSet.toString());

        //Iterating over TreeSet using for loop
        System.out.println("** Iterating using for loop **");
        for(User user : userSet){
            System.out.println(user.getFirstName());
        }


        //Iterating over TreeSet using Iterator
        System.out.println("** Iterating using Iterator **");
        Iterator iterator = userSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    private static void populateUser(Set<User> userSet) {
        userSet.add(new User("Anirudh","Bhatnagar",100));
        userSet.add(new User("Jack","Daniel",150));
        userSet.add(new User("Kate","Xyz",120));
        userSet.add(new User("Bosco","Ceasor",140));
    }

}
