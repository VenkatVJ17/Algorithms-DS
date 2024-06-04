package com.venkatscode;

import java.util.HashSet;

public class Celebrity {

    String name;
    int age;

    public Celebrity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Celebrity) || obj == null)
            return false;

        Celebrity otherCeleb = (Celebrity) obj;
        return name.equals(otherCeleb.name);
    }

    public int hashCode(){
        return age;
    }

    public static void main(String[] args) {

        findTypeofObject("abcd");

        HashSet<Celebrity> set = new HashSet();
        Celebrity realKardashian = new Celebrity("Kim", 17);
        Celebrity kardashianClone = new Celebrity("Kim", 17);

        System.out.println(realKardashian.equals(kardashianClone));

        set.add(realKardashian);

        if (set.contains(kardashianClone)) {
            System.out.println("Kim is a celebrity");
        } else {
            System.out.println("Can't find Kim");
        }
    }

    public static void findTypeofObject(Object input) {
        System.out.println(input.getClass().getSimpleName());
        System.out.println(input.getClass().getSuperclass().getSimpleName());
        System.out.println(input.getClass().getSuperclass().getInterfaces().length);
    }
}
