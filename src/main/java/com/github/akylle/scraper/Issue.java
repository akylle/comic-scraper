package com.github.akylle.scraper;

import java.time.LocalDate;

public class Issue {

	private final Publisher publisher;
	private final String series;
	private final int issueNumber;
	private final LocalDate releaseDate;
	
	public Issue(final Publisher publisher,
			final String series,
			final int issueNumber,
			final LocalDate releaseDate) {
		this.publisher = publisher;
		this.series = series;
		this.issueNumber = issueNumber;
		this.releaseDate = releaseDate;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public String getSeries() {
		return series;
	}

	public int getIssueNumber() {
		return issueNumber;
	}
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
}
