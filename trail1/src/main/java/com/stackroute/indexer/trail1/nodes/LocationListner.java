package com.stackroute.indexer.trail1.nodes;

public class LocationListner {
	private String profileId;
	private String cityName;
	private boolean livesIn;

	public LocationListner() {
		super();
	}

	public LocationListner(String profileId, String cityName, boolean livesIn) {
		super();
		this.profileId = profileId;
		this.cityName = cityName;
		this.livesIn = livesIn;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public boolean isLivesIn() {
		return livesIn;
	}

	public void setLivesIn(boolean livesIn) {
		this.livesIn = livesIn;
	}

	@Override
	public String toString() {
		return "LocationListner [profileId=" + profileId + ", cityName=" + cityName + ", livesIn=" + livesIn + "]";
	}

}
