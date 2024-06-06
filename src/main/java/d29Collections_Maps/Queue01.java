package d29Collections_Maps;

import java.util.*;

public class Queue01 {

    public static void main(String[] args) {

        //In java, a queue is data structure where data is stored and processed in specific order...
        /*
        It follows the First in First out (FIFO)
      FIFO PRINCIPLE, MEANING THE FIRST OBJECT ADDED IS THE FIRST TO BE REMOVED.....
      Queus are used for ordered operations and processing data. It is no possible insert elements in the midddle....


         */

//        Here are a few real-world examples:
//
//        Queue Line: The person at the front of the line is served first. For example,
//        think of how orders are processed in a fast-food restaurant.
//                The first order placed is the first to be prepared and delivered.
//                Ticket Queue: People wanting to buy tickets for a concert or event line up.
//        Tickets are sold in order, and the first person in line gets their ticket first.
//                Call Queue: Customers at a customer service call center are connected to operators in order.
//                The first caller waiting is served first, followed by the next in line.
//                File Processing: Computer operating systems and applications process files in order.
//                When one file process is completed, the next file in the queue is processed.

        /*
        the working principle of queue is to add elements to the end of the queue and remove them from the begininng...
        Queues interfaces acan be implemented by diffrent classes such as LinkedList

        Queues are useful when ordered operations or data are needed..

         */

        //How to create Queue???

        Queue<String> storage = new LinkedList<>();

        storage.add("Milk");
        storage.add("Eat");
        storage.add("Egg");
        storage.add("Baklava");
        storage.add("Kunefe");
        storage.add("Fruit");

        System.out.println("storage = " + storage); //storage = [Milk, Eat, Egg, Baklava, Kunefe, Fruit]

       String removedElement = storage.remove();
        System.out.println("removedElement = " + removedElement);//Milk
        System.out.println("storage = " + storage); //[Eat, Egg, Baklava, Kunefe, Fruit]

        Queue<String> storage1 = new LinkedList<>();
//        System.out.println("storage1.remove() = " + storage1.remove()); //NoSuchElementException

        //peek() method returns the item at the in front of the queue, returns null if the queue is empty....
        System.out.println("storage1.peek() = " + storage1.peek()); //storage1.peek() = null

        //Clear() method removes all the items in the queue, making it empty...
        storage.clear();

        System.out.println("storage = " + storage); //storage = []

        //Element() returns the item at front of the queue but unfortunately you will get exception if the list empty....
//        System.out.println("storage1.element() = " + storage1.element()); //NoSuchElementException


        //Priority Queue

        // PriorityQueue is a queue tool that sorts objects according to their priority order in a FIFO (first in first out) structure.
        // That is, the object with the highest priority is always removed first.

        //A real-life example could be the order of patients entering the emergency room at a hospital
        // represented as a priorityQueue. Patients are sorted according to their urgency levels.
        // The patient with the highest urgency is always treated first

        // A comparator operator work will priorityQueue

        //How to create Priority Queue

        PriorityQueue<String> emergencyPatients = new PriorityQueue<>();

        emergencyPatients.add("Mehmet");
        emergencyPatients.add("Mathias");
        emergencyPatients.add("Edin");
        emergencyPatients.add("Micheal");
        emergencyPatients.add("Maria");
        System.out.println("emergencyPatients = " + emergencyPatients); //emergencyPatients = [Edin, Maria, Mathias, Micheal, Mehmet]

        //Deque (Double- ended) is data structure that allows adding and removing elements from the both ends...
        //Deque can be sorted as FIFO(FIRST IN FIRTS OUT) AND LIFO(LAST IN FIRST OUT)
        //  Most software applications allow users to undo and redo their actions.

        Deque<String> d = new LinkedList<>();
        d.add("Mehmet");
        d.add("Mathias");
        d.add("Edin");
        d.add("Micheal");
        d.add("Maria");
        System.out.println(d); // [Mehmet, Mathias, Edin, Micheal, Maria]

        d.addFirst("Tom");
        d.addLast("Hanks");
        System.out.println("d = " + d); //d = [Tom, Mehmet, Mathias, Edin, Micheal, Maria, Hanks]

        d.removeFirst();
        d.removeLast();
        System.out.println("d = " + d); // d = [Mehmet, Mathias, Edin, Micheal, Maria]

        //ArrayDeque
        // This structure allows for fast addition and removal of elements at both the beginning and the end.
        // ArrayDeque offers higher performance compared to LinkedList because it uses an array-based structure for its contents.
        // ArrayDeque is ideal for fast addition/removal operations at both ends.
        //ArrayDeque has a dynamic structure

        ArrayDeque<String> adeq = new ArrayDeque<>();
        adeq.addFirst("first");
        adeq.addLast("last");

        System.out.println("adeq = " + adeq); //adeq = [first, last]

        adeq.removeFirst();
        adeq.removeLast();
        System.out.println("adeq = " + adeq); //adeq = []



    }
}
