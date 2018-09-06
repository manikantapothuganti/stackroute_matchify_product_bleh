package com.stackroute.indexer.trail1.nodes;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = "City")
public class CityLivedIn {
	@Id
	private String name;

	public CityLivedIn() {
		super();
	}

	public CityLivedIn(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CityLivedIn [name=" + name + "]";
	}

}
