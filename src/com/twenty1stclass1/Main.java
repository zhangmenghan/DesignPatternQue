package com.twenty1stclass1;

public class Main {
    public static void main(String[] args) throws Exception {
        Printable p = new PrinterProxy("Alice","Printer");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.print("Hello, world.");
    }
}
