package com.stackroute.indexer.trail1.nodes;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "undergone")
public class TrainingUndergone {
	@Id
	private String duration;
	@StartNode
	private ProfileId profileId;
	@EndNode
	private Training training;

	public TrainingUndergone() {
		super();
	}

	public TrainingUndergone(String duration, ProfileId profileId, Training training) {
		super();
		this.duration = duration;
		this.profileId = profileId;
		this.training = training;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public ProfileId getProfileId() {
		return profileId;
	}

	public void setProfileId(ProfileId profileId) {
		this.profileId = profileId;
	}

	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	@Override
	public String toString() {
		return "TrainingUndergone [duration=" + duration + ", profileId=" + profileId + ", training=" + training + "]";
	}

}
