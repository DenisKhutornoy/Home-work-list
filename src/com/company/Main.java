package com.company;

import com.company.listClasses.List;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        Integer [] arrey={1,2,3,4,5,6,};

       list.createListfromArrey(arrey);
       list.addElementTail(7);
        list.addElementTail(5);
        list.addElementTail(33);
       list.addElementHead(2);
        list.addElementHead(1);
        list.addElementTail(6);
       list.deleteElement(33);
       list.addElementByindex(3,3);
       list.replaceElementsByindex(3,5);
       list.deleteElementhead();
       list.deleteElementbyIndex(2);
        list.deleteElementTail();
        list.printList();
        list.empty();
        System.out.println();
    }
}
