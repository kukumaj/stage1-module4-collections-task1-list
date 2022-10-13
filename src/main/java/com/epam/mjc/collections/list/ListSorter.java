package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator  listComparator = new ListComparator();
        sourceList.sort(listComparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int firstElement = Integer.parseInt(a);
        int secondElement = Integer.parseInt(b);
        int resultOne = (int) (5 * Math.pow(firstElement,2)+3);
        int resultTwo = (int) (5 * Math.pow(secondElement,2)+3);
        return resultOne > resultTwo ? 1 : -1;
    }
}
