package com.seventeenthclass1;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<Observer>();        // 保存Observer们
    public void addObserver(Observer observer) {    // 注册Observer
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) { // 删除Observer
        observers.remove(observer);
    }
    public void notifyObservers() {               // 向Observer发送通知
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer o = it.next();
            o.update(this);
        }
    }
    public abstract int getNumber();                // 获取数值
    public abstract void execute();                 // 生成数值
}
