package com.stackroute.matchmaker.autocompletemicroservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.stackroute.matchmaker.autocompletemicroservice.domains.University;
import com.stackroute.matchmaker.autocompletemicroservice.domains.UniversityRedis;

public interface UniversityRedisRepository extends CrudRepository<UniversityRedis, String> {

}
