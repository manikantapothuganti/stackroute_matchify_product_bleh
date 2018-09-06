package com.stackroute.matchmaker.autocompletemicroservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.autocompletemicroservice.domains.City;
import com.stackroute.matchmaker.autocompletemicroservice.domains.Company;
import com.stackroute.matchmaker.autocompletemicroservice.domains.Skill;
import com.stackroute.matchmaker.autocompletemicroservice.domains.University;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.CityRedisRepository;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.CityRepository;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.CompanyRedisRepository;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.CompanyRepository;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.SkillRedisRepository;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.SkillRepository;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.UniversityRedisRepository;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.UniversityRepository;

@Service
public class RedisServiceImpl implements RedisService {
	private CityRedisRepository cityRedisRepository;
	private SkillRedisRepository skillRedisRepository;
	private CompanyRedisRepository companyRedisRepository;
	private UniversityRedisRepository universityRedisRepository;
	private CityRepository cityRepository;
	private SkillRepository skillRepository;
	private CompanyRepository companyRepository;
	private UniversityRepository universityRepository;

	@Autowired
	public RedisServiceImpl(CityRedisRepository cityRedisRepository, SkillRedisRepository skillRedisRepository,
			CompanyRedisRepository companyRedisRepository, UniversityRedisRepository universityRedisRepository,
			CityRepository cityRepository, SkillRepository skillRepository, CompanyRepository companyRepository,
			UniversityRepository universityRepository) {
		super();
		this.cityRedisRepository = cityRedisRepository;
		this.skillRedisRepository = skillRedisRepository;
		this.companyRedisRepository = companyRedisRepository;
		this.universityRedisRepository = universityRedisRepository;
		this.cityRepository = cityRepository;
		this.skillRepository = skillRepository;
		this.companyRepository = companyRepository;
		this.universityRepository = universityRepository;
	}

	public RedisServiceImpl() {

	}

	@Override
	public void saveCities() {
		cityRedisRepository.saveAll(cityRepository.findAll());

	}

	@Override
	public void saveSkills() {
		skillRedisRepository.saveAll(skillRepository.findAll());

	}

	@Override
	public void saveCompanies() {
		companyRedisRepository.saveAll(companyRepository.findAll());

	}

	@Override
	public void saveUniversities() {
		universityRedisRepository.saveAll(universityRepository.findAll());

	}

	@Override
	public List<City> getAllCities() {

		return (List<City>) cityRedisRepository.findAll();
	}

	@Override
	public List<Skill> getAllSkills() {

		return (List<Skill>) skillRedisRepository.findAll();
	}

	@Override
	public List<Company> getAllCompanies() {

		return (List<Company>) companyRedisRepository.findAll();
	}

	@Override
	public List<University> getAllUniversities() {

		return (List<University>) universityRedisRepository.findAll();
	}
}
