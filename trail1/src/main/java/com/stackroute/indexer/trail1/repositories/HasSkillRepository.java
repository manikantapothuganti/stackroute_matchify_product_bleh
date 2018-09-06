package com.stackroute.indexer.trail1.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.indexer.trail1.nodes.HasSkill;

public interface HasSkillRepository extends Neo4jRepository<HasSkill, String>{

}
