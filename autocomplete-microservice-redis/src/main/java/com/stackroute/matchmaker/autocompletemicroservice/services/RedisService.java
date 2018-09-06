package com.stackroute.matchmaker.autocompletemicroservice.services;

import java.util.List;

import com.stackroute.matchmaker.autocompletemicroservice.domains.City;
import com.stackroute.matchmaker.autocompletemicroservice.domains.Company;
import com.stackroute.matchmaker.autocompletemicroservice.domains.Skill;
import com.stackroute.matchmaker.autocompletemicroservice.domains.University;

public interface RedisService {
	public void saveCities();

	public void saveSkills();

	public void saveCompanies();

	public void saveUniversities();

	public List<City> getAllCities();

	public List<Skill> getAllSkills();

	public List<Company> getAllCompanies();

	public List<University> getAllUniversities();

}
