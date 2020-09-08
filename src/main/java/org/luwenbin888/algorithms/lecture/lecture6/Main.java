package org.luwenbin888.algorithms.lecture.lecture6;

public class Main {

    public static void main(String[] args) {
        LinkedListLRUCache cache = new LinkedListLRUCache(10);

        cache.add(1);
        cache.add(2);
        cache.add(3);
        cache.printCacheData();

        System.out.println(cache.get(1));
        cache.printCacheData();
        cache.add(5);
        cache.printCacheData();

        System.out.println(cache.get(3));
        cache.printCacheData();

        cache.add(10);
        cache.add(11);
        cache.add(12);
        cache.add(13);
        cache.add(15);
        cache.add(16);
        cache.printCacheData();

        cache.add(18);
        cache.printCacheData();

    }
}
