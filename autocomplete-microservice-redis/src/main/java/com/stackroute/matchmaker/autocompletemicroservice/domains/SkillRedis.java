package com.stackroute.matchmaker.autocompletemicroservice.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Skill")
public class SkillRedis {
	@Id
	private String name;

	public SkillRedis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SkillRedis(String name) {
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
		return "SkillRedis [name=" + name + "]";
	}

}
