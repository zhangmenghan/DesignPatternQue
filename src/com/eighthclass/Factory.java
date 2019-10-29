package com.eighthclass;

public abstract class Factory {
	@SuppressWarnings("deprecation")
	public static Factory getFactory(String classname) throws Exception, ClassNotFoundException {
		Factory factory = null;
		factory = (Factory) Class.forName(classname).newInstance();
		System.out.println("can not find" + classname);
		return factory;
	}
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}
