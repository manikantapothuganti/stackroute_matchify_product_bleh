package com.stackroute.matchmaker.autocompletemicroservice.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Company")
public class CompanyRedis {
	@Id
	private String organizationName;

	public CompanyRedis() {
		super();
	}

	public CompanyRedis(String organizationName) {
		super();
		this.organizationName = organizationName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	@Override
	public String toString() {
		return "Company [organizationName=" + organizationName + "]";
	}

}
