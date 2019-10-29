package com.tenthclass2;

public class SortAndPrint {
    Comparable<String>[] data;
    Sorter sorter;
    public SortAndPrint(Comparable<String>[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }
    public void execute() {
        print();
        sorter.sort(data);
        print();
    }
    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("");
    }
}
