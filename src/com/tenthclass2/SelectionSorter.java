package com.tenthclass2;

public class SelectionSorter implements Sorter {
    public void sort(Comparable<String>[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[min].compareTo((String) data[j]) > 0) {
                    min = j;
                }
            }
            Comparable<String> passingplace = data[min];
            data[min] = data[i];
            data[i] = passingplace;
        }
    }
}
