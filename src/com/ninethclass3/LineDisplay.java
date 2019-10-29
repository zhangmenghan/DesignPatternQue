package com.ninethclass3;

public class LineDisplay extends Display {
    public LineDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times) {       // 循环显示times次
        for (int i = 0; i < times; i++) {
			singleDisplay(i);
		}
    }
    private void singleDisplay(int times) {
    	open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
