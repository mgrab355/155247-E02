package Z2;

import java.util.*;

public class print {
    public static <E> void print(Iterable<E> obj) {
        for (E i : obj) {
            System.out.print("[" + i + "],");
        }
    }

    public static void main(String[] args) {
        Vector<Double> doubleList = new Vector<>();
        doubleList.add(2.2);
        doubleList.add(1.3);
        doubleList.add(7.5);
        doubleList.add(1.22);
        System.out.println();
        print(doubleList);

        Set<String> setList = new HashSet<>();
        setList.add("to");
        setList.add("jest");
        setList.add("test");
        setList.add("zadania");
        System.out.println();
        print(setList);

        Queue<String> queueList = new PriorityQueue<>();
        queueList.add("test");
        queueList.add("kolejki");
        queueList.add("zadania");
        queueList.add("drugiego");
        System.out.println();
        print(queueList);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(2);
        intList.add(1);
        intList.add(4);
        System.out.println();
        print(intList);

    }

}

