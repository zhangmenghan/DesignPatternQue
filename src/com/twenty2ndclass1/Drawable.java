package com.twenty2ndclass1;

import java.awt.Color;                          

public interface Drawable {
    public abstract void init();                
    public abstract void draw(int x, int y);
    public abstract void setColor(Color color); 
}
