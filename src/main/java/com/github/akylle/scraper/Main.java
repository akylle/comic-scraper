package com.github.akylle.scraper;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {

	public static void main(String [] args) throws IOException {
		final Scraper s = new Scraper("http://www.comiclist.com/index.php");
		final Document doc = s.getDocument();
		
		for(final Element e : doc.getElementsByTag("strong")) {
			System.out.println(e.html() + " " + e.childNodeSize());
			
		}
	}
}
