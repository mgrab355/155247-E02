package Z1;

import java.time.LocalTime;
import java.util.Arrays;

public class Z1test {
    public static <T extends Comparable<? super T>> boolean isSorted(T[] tab) {
        return Arrays.equals(Arrays.stream(tab).sorted().toArray(), tab);
    }

    public static void main(String[] args) {

        Integer[] tabSorted = new Integer[5];
        tabSorted[0] = 5;
        tabSorted[1] = 6;
        tabSorted[2] = 7;
        tabSorted[3] = 8;
        tabSorted[4] = 9;
        System.out.println(isSorted(tabSorted));

        String[] tabString = new String[5];
        tabString[0] = ("to");
        tabString[1] = ("jest");
        tabString[2] = ("test");
        tabString[3] = ("zadania");
        tabString[4] = ("pierwszego");
        System.out.println(isSorted(tabString));

        Integer[] tabUnsorted = new Integer[5];
        tabUnsorted[0] = 4;
        tabUnsorted[1] = 2;
        tabUnsorted[2] = 3;
        tabUnsorted[3] = 1;
        tabUnsorted[4] = 9;
        System.out.println(isSorted(tabUnsorted));

        LocalTime[] tabTime = new LocalTime[5];
        tabTime[0] = LocalTime.of(12,34,55);
        tabTime[1] = LocalTime.of(13,34,55);
        tabTime[2] = LocalTime.of(14,34,55);
        tabTime[3] = LocalTime.of(15,34,55);
        tabTime[4] = LocalTime.of(16,34,55);
        System.out.println(tabTime);

        LocalTime[] tabTime2 = new LocalTime[5];
        tabTime[0] = LocalTime.of(12,34);
        tabTime[1] = LocalTime.of(11,34);
        tabTime[2] = LocalTime.of(10,34);
        tabTime[3] = LocalTime.of(9,34);
        tabTime[4] = LocalTime.of(8,34);
        System.out.println(tabTime2);


    }
}

