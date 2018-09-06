package com.stackroute.matchmaker.autocompletemicroservice.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("University")
public class UniversityRedis {
	@Id
	private String instituteName;

	public UniversityRedis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UniversityRedis(String instituteName) {
		super();
		this.instituteName = instituteName;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	@Override
	public String toString() {
		return "UniversityRedis [instituteName=" + instituteName + "]";
	}

}
