package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    record Person(String fname,String lname){
        @Override
        public String toString() {
            return "Person{" +
                    "fname='" + fname + '\'' +
                    ", lname='" + lname + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>(Arrays.asList(
                new Person("John","Doe"),
                new Person("Jane","Doe"),
                new Person("Alice","Smith"),
                new Person("Bob","Johnson")
        ));

        var comapareLname=new Comparator<Person>(){

            @Override
            public int compare(Person person, Person t1) {
                return person.lname.compareTo(t1.lname);
            }
        };

        list.sort((o1,o2)->o1.lname.compareTo(o2.lname));
        System.out.println(list);


    }
}
