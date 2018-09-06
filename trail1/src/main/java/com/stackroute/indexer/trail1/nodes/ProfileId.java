package com.stackroute.indexer.trail1.nodes;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NodeEntity
public class ProfileId {
	@Id
	private String profileId;
	@Relationship(type = "livesIn", direction = Relationship.OUTGOING)
	private CityLivesIn cityLivesIn;

	@Relationship(type = "livedIn", direction = Relationship.OUTGOING)
	private CityLivedIn cityLivedIn;

	// @Relationship(type = "hasSkill", direction = Relationship.OUTGOING)
	// private Skill skill;

	public ProfileId() {
		super();
	}

	public ProfileId(String profileId, CityLivesIn cityLivesIn, CityLivedIn cityLivedIn) {
		super();
		this.profileId = profileId;
		this.cityLivesIn = cityLivesIn;
		this.cityLivedIn = cityLivedIn;
	}

	public ProfileId(String profileId, CityLivesIn cityLivesIn) {
		super();
		this.profileId = profileId;
		this.cityLivesIn = cityLivesIn;
	}

	public ProfileId(String profileId, CityLivedIn cityLivedIn) {
		super();
		this.profileId = profileId;
		this.cityLivedIn = cityLivedIn;
	}

	/*
	 * // public ProfileId(String profileId, Skill skill) { // super(); //
	 * this.profileId = profileId; // this.skill = skill; // }
	 */
	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public CityLivesIn getCityLivesIn() {
		return cityLivesIn;
	}

	public void setCityLivesIn(CityLivesIn cityLivesIn) {
		this.cityLivesIn = cityLivesIn;
	}

	public CityLivedIn getCityLivedIn() {
		return cityLivedIn;
	}

	public void setCityLivedIn(CityLivedIn cityLivedIn) {
		this.cityLivedIn = cityLivedIn;
	}

	public ProfileId(String profileId) {
		super();
		this.profileId = profileId;
	}

	/*
	 * public Skill getSkill() { return skill; }
	 * 
	 * public void setSkill(Skill skill) { this.skill = skill; }
	 */
}
