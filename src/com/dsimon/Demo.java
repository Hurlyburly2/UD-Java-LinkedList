package com.dsimon;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newcity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            //COMPARISON
            int comparison = stringListIterator.next().compareTo(newcity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newcity + " is already included as a destination.");
                return false;
            } else if (comparison > 0) {
                // new city should appear before this one
                // eg. looking at Brisbane --> trying to add Adelaide --> use previous() to add it before brisbane
                stringListIterator.previous();
                stringListIterator.add(newcity);
                return true;
            } else if (comparison < 0) {
                // move on to the next city
                //we already do that with the .next() above
            }
        }
        //if it didn't find something the new city should go before, add it to the end
        stringListIterator.add(newcity);
    }
}
