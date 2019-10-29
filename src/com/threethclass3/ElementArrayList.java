package com.threethclass3;

import java.util.ArrayList;
import java.util.Iterator;

class ElementArrayList extends ArrayList<Entry> implements Element {
	private static final long serialVersionUID = 1L;

	public void accept(Visitor v) {
        Iterator<Entry> it = iterator();
        while (it.hasNext()) {
            Element e = (Element)it.next();
            e.accept(v);
        }
    }
}
