package com.stackroute.matchmaker.autocompletemicroservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.stackroute.matchmaker.autocompletemicroservice.domains.City;
import com.stackroute.matchmaker.autocompletemicroservice.domains.CityRedis;

public interface CityRedisRepository extends CrudRepository<CityRedis, String> {

}
