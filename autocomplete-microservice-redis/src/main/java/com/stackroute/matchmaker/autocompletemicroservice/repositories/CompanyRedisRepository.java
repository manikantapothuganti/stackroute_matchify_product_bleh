package com.stackroute.matchmaker.autocompletemicroservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.stackroute.matchmaker.autocompletemicroservice.domains.Company;
import com.stackroute.matchmaker.autocompletemicroservice.domains.CompanyRedis;

public interface CompanyRedisRepository extends CrudRepository<CompanyRedis, String> {

}
