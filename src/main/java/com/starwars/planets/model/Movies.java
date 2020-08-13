package com.starwars.planets.model;

import io.swagger.annotations.ApiModelProperty;

public class Movies {

	@ApiModelProperty(value = "movie link at https://swapi.dev/")
	private String link;
	
	public Movies() {
		super();
	}

	public Movies(String link) {
		super();
		this.setLink(link);
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
}
