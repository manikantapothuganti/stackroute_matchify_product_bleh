package com.stackroute.matchmaker.searchmicroservice.repositories;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.stackroute.matchmaker.searchmicroservice.model.ProfileId;

/**
 * 
 * @author syam
 *
 */
public interface ProfileIdRepository extends Neo4jRepository<ProfileId, String> {

	@Query("MATCH (p:ProfileId)-[:hasSkill]->(s:Skill) where  s.name={name} return p "
			+ " UNION MATCH (p)-[:undergone]->(t:Training)-[:coversSkill]->(s)where  s.name={name} RETURN p "
			+ " UNION MATCH (p)-[:workedIn]->(pro:Project)-[:usesSkill]->(s) where s.name={name} RETURN p UNION"
			+ "MATCH (p)-[:hasSkill]->(s)<-[:partWholeOf]-()<-[:hasSkill]-(pl) return p,pl")
	public List<ProfileId> profilebasedOnSkill(@Param("name") String name);

}
