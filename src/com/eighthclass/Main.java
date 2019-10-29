package com.eighthclass;

public class Main {
	public static void main(String[] args) throws Exception {
		Factory factory = Factory.getFactory(args[0]);
		Link people = factory.createLink("人民日报", "http:www.baidu.com");
		Link gmw = factory.createLink("光明日报", "http:www.baidu.com");
		
		Link us_yahoo = factory.createLink("Yahoo", "http:www.baidu.com");
		Link jp_yahoo = factory.createLink("Yahoo!Japan!", "http:www.baidu.com");
		Link excite = factory.createLink("Excite", "http:www.baidu.com");
		Link google = factory.createLink("Google", "http:www.baidu.com");
		
		Tray traynews = factory.createTray("日报");
		traynews.add(people);
		traynews.add(gmw);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);
		
		Tray traysearch = factory.createTray("search");
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "zmh");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}
}
