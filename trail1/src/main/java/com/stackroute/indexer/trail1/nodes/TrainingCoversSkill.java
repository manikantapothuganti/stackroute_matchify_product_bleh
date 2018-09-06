package com.stackroute.indexer.trail1.nodes;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "coversSkill")
public class TrainingCoversSkill {
	@Id
	private String weight;
	@StartNode
	private Training training;
	@EndNode
	private Skill skill;

	

	public TrainingCoversSkill(String weight, Training training, Skill skill) {
		super();
		this.weight = weight;
		this.training = training;
		this.skill = skill;
	}

	public TrainingCoversSkill() {
		super();
	}

	@Override
	public String toString() {
		return "TrainingCoversSkill [weight=" + weight + "]";
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}
