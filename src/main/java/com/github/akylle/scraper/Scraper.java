package com.github.akylle.scraper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Scraper {

	private final Document document;
	
	public Scraper(final String url) throws IOException {
		document = Jsoup.connect(url).get();
	}
	
	public Document getDocument() {
		return document;
	}
	
}
