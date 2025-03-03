package algprg;

import java.util.List;

public class linkedlist {

    ListItem first;

    ListItem last;

    public Linkedlist(){

    }

    public void append(int value){

        ListItem item = new ListItem();
        item.value = value;

        if (first == null){
            first = item;
            last = item;
        }
        else {
            last.next = item;
            last = item;
        }

        first = item;

    }

    public boolean contain(int value){

        ListItem current = first;

        if (current == null){
            return false;
        }

        while (current.next){

            current = current.next;

            if (current == null){
                return false;
            }
        }
        return true;
    }

    public void print(){

        System.out.println("Linked list: ");


    }

    public boolean remove(int value){

        ListItem previous = null;
        ListItem current = first;


        while (current != null){

            if (current.value == value){
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    public class ListItem{

        ListItem next = null;

        int value;

    }

}
