package com.stackroute.indexer.trail1.nodes;

public class SkillListner {
	private String profileId;
	private String skill;
	private String weightage;

	public SkillListner() {
		super();
	}

	public SkillListner(String profileId, String skill, String weightage) {
		super();
		this.profileId = profileId;
		this.skill = skill;
		this.weightage = weightage;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getWeightage() {
		return weightage;
	}

	public void setWeightage(String weightage) {
		this.weightage = weightage;
	}

	@Override
	public String toString() {
		return "SkillListner [profileId=" + profileId + ", skill=" + skill + ", weightage=" + weightage + "]";
	}

}
