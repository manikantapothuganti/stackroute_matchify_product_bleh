package com.stackroute.indexer.trail1.nodes;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = "City")
public class CityLivesIn {
	@Id
	private String name;

	public CityLivesIn() {
		super();
	}

	public CityLivesIn(String name) {
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
		return "CityLivesIn [name=" + name + "]";
	}

}
