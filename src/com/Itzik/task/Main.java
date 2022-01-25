package com.Itzik.task;

public class Main {
    public static void main(String[] args) {
        Cache<Integer, String> cache = new Cache<>(5);

        System.out.println("Added: " + cache.add(1, "ITEM - 1"));
        cache.printLinkedHashMapValues();
        System.out.println();

        System.out.println("Added: " + cache.add(2, "ITEM - 2"));
        cache.printLinkedHashMapValues();
        System.out.println();

        System.out.println("Added: " + cache.add(3, "ITEM - 3"));
        cache.printLinkedHashMapValues();
        System.out.println();

        System.out.println("Added: " + cache.add(4, "ITEM - 4"));
        cache.printLinkedHashMapValues();
        System.out.println();

        System.out.println("Added: " + cache.add(5, "ITEM - 5"));
        cache.printLinkedHashMapValues();
        System.out.println();

        System.out.println("Used: " + cache.get(1));
        cache.printLinkedHashMapValues();
        System.out.println();

        System.out.println("Added: " + cache.add(6, "ITEM - 6"));
        cache.printLinkedHashMapValues();
        System.out.println();

        System.out.println("Added: " + cache.add(7, "ITEM - 7"));
        cache.printLinkedHashMapValues();
        System.out.println();

        System.out.println("Used: " + cache.get(3));
        cache.printLinkedHashMapValues();
        System.out.println();

        System.out.println("Added: " + cache.add(8, "ITEM - 8"));
        cache.printLinkedHashMapValues();
        System.out.println();

        System.out.println("Added: " + cache.add(7, "ITEM - 7"));
        cache.printLinkedHashMapValues();
        System.out.println();
    }
}
