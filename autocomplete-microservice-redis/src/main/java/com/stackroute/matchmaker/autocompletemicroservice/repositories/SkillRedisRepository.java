package com.stackroute.matchmaker.autocompletemicroservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.stackroute.matchmaker.autocompletemicroservice.domains.Skill;
import com.stackroute.matchmaker.autocompletemicroservice.domains.SkillRedis;

public interface SkillRedisRepository extends CrudRepository<SkillRedis, String> {

}
