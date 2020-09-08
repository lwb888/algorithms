package org.luwenbin888.algorithms.datastructure.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(2);
        list1.append(3);

        System.out.println(list1.toString());

        LinkedListNode node = list1.search(4);
        if (node != null) {
            System.out.println(node.data);
        }

        System.out.println(list1.indexOf(0));

        list1.delete(4);
        System.out.println(list1.toString());

        list1.reverse();
        System.out.println(list1.toString());

        list1.deleteLast();
        System.out.println(list1.toString());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        LinkedList list2 = LinkedList.construct(list);
        System.out.println(list2);
        list2.appendFirst(5);
        System.out.println(list2);

        LinkedList list3 = LinkedList.construct(list);
        System.out.println(list3);
        list3.deleteLast();
        System.out.println(list3);
        list3.deleteLast();
        System.out.println(list3);
        list3.deleteLast();
        System.out.println(list3);
        list3.deleteLast();
        System.out.println(list3);
        list3.appendFirst(5);
        System.out.println(list3);
    }
}
