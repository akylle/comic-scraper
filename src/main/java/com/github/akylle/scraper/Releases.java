package com.github.akylle.scraper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Releases {

	public static Builder newBuilder() {
		return new Builder();
	}
	
	private final Map<Publisher, List<Issue>> releases;
	
	private Releases(final Map<Publisher, List<Issue>> releases) {
		this.releases = releases;
	}
	
	public List<Issue> getDCIssues() {
		return releases.get(Publisher.DC);
	}
	
	public List<Issue> getMarvelIssues() {
		return releases.get(Publisher.MARVEL);
	}
	
	public List<Issue> getImageIssues() {
		return releases.get(Publisher.IMAGE);
	}
	
	public List<Issue> getDarkHorseIssues() {
		return releases.get(Publisher.DARKHORSE);
	}
	
	public List<Issue> getIDWIssues() {
		return releases.get(Publisher.IDW);
	}
	
	public static class Builder {
		private final Map<Publisher, List<Issue>> releases;
		
		public Builder() {
			releases = new HashMap<Publisher, List<Issue>>();
			releases.put(Publisher.DC, new ArrayList<Issue>());
		}
		
		public Releases build() {
			return new Releases(releases);
		}
		
		public void setDCIssues(final List<Issue> issues) {
			releases.put(Publisher.DC, issues);
		}
		
		public void addDCIssue(final Issue issue) {
			releases.get(Publisher.DC).add(issue);
		}
	}
}
