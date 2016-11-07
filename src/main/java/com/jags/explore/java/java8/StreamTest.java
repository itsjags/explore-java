package com.jags.explore.java.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jags on 21/10/2015.
 *
 * Class to play around with Stream API
 */
public class StreamTest {

    public static void main(String[] args) {

        final List<String> slist = Arrays.asList("a5", "b1", "a2", "a4", "c1");
//        System.out.println(slist.stream().filter(p -> p != null).findFirst().get());

        slist.stream().sorted().forEach(p -> System.out.println(p));
        getPersons().stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(person -> System.out.println(person));
        final Set<Person> collect = getPersons().stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toSet());
        final List<Person> list = getPersons().stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(list);
        getPersons().stream().sorted((p1, p2) -> p1.getAge() - p2.getAge()).forEach(person -> System.out.println(person));
//
//        slist.stream()
//                .filter((s) -> s.startsWith("a"))
//                .sorted()
//                .forEach(s -> System.out.println(s));

        System.out.println(slist.stream()
                .filter(s -> s.contains("z"))
                .count());
//
//        final Map<String, List<Person>> collect = getPersons().stream()
//                .collect(Collectors.groupingBy((Person p) -> p.getName().equals("jags")));

    }

    public static Collection<Person> getPersons() {
        final List<Person> persons = Stream.of(
                    new Person("jag", 40), new Person("ammu", 30), new Person("giri", 25), new Person("jags", 10), new Person("girish", 30)
                ).collect(Collectors.toList());
        return persons;
    }
}



class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
