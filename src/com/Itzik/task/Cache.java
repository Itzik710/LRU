package com.Itzik.task;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

//Implement a LRU (Least recently used) cache in Java.
//        a.	Cache has limited number of entries
//        b.	Cache know which item was least recently used
//        c.	Cache can add new item only if there is space.
//        If no , it will delete the least recently used and add new item instead.
//        Implement “add” new item.
//        Hint : the purpose is to be as efficient as possible…

public class Cache<K, V> {
    private final int LIMIT_SIZE;

    // Time complexity: put(), remove(), get(), containsKey() = O(1)
    private final LinkedHashMap<K, V> linkedHashMap;

    public Cache(int limitSize) {
        this.LIMIT_SIZE = limitSize;
        linkedHashMap = new LinkedHashMap<>();
    }

    // Time complexity : O(n) in case of Deletion, otherwise O(1)
    public V add(K key, V value) {
        if (key == null || value == null) {
            return null;
        }

        if (this.linkedHashMap.size() == LIMIT_SIZE && !isLinkedHashMapContainsKey(key)) {
            // By default if none of the entries were in used I'll remove the last item in the map
            this.linkedHashMap.remove(getLeastRecentlyUsedItem());
        }

        this.linkedHashMap.put(key, value);
        return value;
    }

    // Time complexity : O(1)
    public V get(K key) {
        if (key == null) {
            return null;
        }

        // value may be null: in that case I'll use a try catch mechanism when using that value after function call
        V value = this.linkedHashMap.get(key);

        if (value != null) {
            this.linkedHashMap.remove(key);
            this.linkedHashMap.put(key, value);
        }

        return value;
    }

    // Time complexity: O(n)
    private K getLeastRecentlyUsedItem() {
        K lastItem = null;
        for (K item : this.linkedHashMap.keySet()) {
            lastItem = item;
        }

        return lastItem;
    }

    private boolean isLinkedHashMapContainsKey(K key) {
        return this.linkedHashMap.containsKey(key);
    }

    private List<V> getLinkedHashMapValues() {
        List<V> elemetsValues = new ArrayList<>();
        for (K key : this.linkedHashMap.keySet()) {
            elemetsValues.add(this.linkedHashMap.get(key));
        }

        return elemetsValues;
    }

    public void printLinkedHashMapValues() {
        System.out.println("LinkedHashMap: " + this.getLinkedHashMapValues());
    }
}
