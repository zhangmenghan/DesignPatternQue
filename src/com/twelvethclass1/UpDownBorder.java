package com.twelvethclass1;

public class UpDownBorder extends Border {
    private char borderChar;                        // 表示装饰边框的字符
    public UpDownBorder(Display display, char ch) {   // 通过构造函数指定Display和装饰边框字符 
        super(display);
        this.borderChar = ch;
    }
    public int getColumns() {                       // 字符数为字符串字符数加上两侧边框字符数 
        return display.getColumns();
    }
    public int getRows() {                          // 行数即被装饰物的行数
        return 1 + display.getRows() + 1;
    }
    public String getRowText(int row) {              // 获取指定行的内容
        if (row == 0 || row == getRows() - 1) {
            return makeLine(borderChar, getColumns());
        } else {
            return display.getRowText(row - 1);
        }
    }
    private String makeLine(char ch, int count) {    // 生成一个由count个字符ch连续组成的字符串 
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
