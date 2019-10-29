package com.tenthclass2;

public class BubbleSorter implements Sorter {
	public void sort(Comparable<String>[] data) {
    	for(int i=0;i<data.length-1;i++) {
            for(int j=0;j<data.length-i-1;j++) {
                if(data[j].compareTo((String) data[j+1])>0) {
                	Comparable<String> temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
    }
}
