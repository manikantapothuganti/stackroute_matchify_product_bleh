package com.stackroute.matchmaker.autocompletemicroservice.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("City")
public class CityRedis {
	@Id
	private String city;

	public CityRedis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityRedis(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "CityRedis [city=" + city + "]";
	}

}
