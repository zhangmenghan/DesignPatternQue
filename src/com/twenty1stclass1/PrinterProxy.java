package com.twenty1stclass1;

public class PrinterProxy implements Printable {
    private String name;            // 名字
    private Printer real;           // “本人”
    private String className;
    public PrinterProxy() {
    }
    public PrinterProxy(String name,String className) {      // 构造函数
        this.name = name;
        this.className = className;
    }
    public synchronized void setPrinterName(String name) {  // 设置名字
        if (real != null) {
            real.setPrinterName(name);  // 同时设置“本人”的名字
        }
        this.name = name;
    }
    public String getPrinterName() {    // 获取名字
        return name;
    }
    public void print(String string) throws Exception {  // 显示
        realize();
        real.print(string);
    }
    @SuppressWarnings("deprecation")
	private synchronized void realize() throws Exception {   // 生成“本人”
        real = (Printer) Class.forName(className).newInstance();
    	real.setPrinterName(name);
    }
}
