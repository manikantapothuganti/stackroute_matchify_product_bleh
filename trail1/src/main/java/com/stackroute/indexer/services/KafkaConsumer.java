package com.stackroute.indexer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.indexer.trail1.nodes.CityLivedIn;
import com.stackroute.indexer.trail1.nodes.CityLivesIn;
import com.stackroute.indexer.trail1.nodes.LocationListner;
import com.stackroute.indexer.trail1.nodes.ProfileId;
import com.stackroute.indexer.trail1.nodes.Skill;
import com.stackroute.indexer.trail1.nodes.SkillListner;
import com.stackroute.indexer.trail1.nodes.Training;
import com.stackroute.indexer.trail1.nodes.TrainingCoversSkill;
import com.stackroute.indexer.trail1.nodes.TrainingListner;
import com.stackroute.indexer.trail1.nodes.TrainingUndergone;
import com.stackroute.indexer.trail1.nodes.HasSkill;
import com.stackroute.indexer.trail1.repositories.CityRepository;
import com.stackroute.indexer.trail1.repositories.ProfileIdRepository;
import com.stackroute.indexer.trail1.repositories.TrainingCoversSkillRepository;
import com.stackroute.indexer.trail1.repositories.TrainingUndergoneRepository;
import com.stackroute.indexer.trail1.repositories.HasSkillRepository;

@Service
public class KafkaConsumer {
	private ProfileIdRepository profileIdRepository;
	private CityRepository cityRepository;
	private HasSkillRepository hasSkillRepository;
	private TrainingUndergoneRepository trainingUndergoneRepository;
	private TrainingCoversSkillRepository trainingCoversSkillRepository;

	@Autowired
	public KafkaConsumer(ProfileIdRepository profileIdRepository, CityRepository cityRepository,
			HasSkillRepository hasSkillRepository, TrainingUndergoneRepository trainingUndergoneRepository,
			TrainingCoversSkillRepository trainingCoversSkillRepository) {
		super();
		this.profileIdRepository = profileIdRepository;
		this.cityRepository = cityRepository;
		this.hasSkillRepository = hasSkillRepository;
		this.trainingUndergoneRepository = trainingUndergoneRepository;
		this.trainingCoversSkillRepository = trainingCoversSkillRepository;
	}

	@KafkaListener(topics = "String_Boo", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

	@KafkaListener(topics = "LocationIndexer", groupId = "group_json", containerFactory = "locationKafkaListenerFactory")
	public void consumeJson(LocationListner locationListner) {
		System.out.println("Consumed JSON Message: " + locationListner);
		// cityRepository.findById(locationListner.getCityName());
		// System.out.println(cityRepository.findById(locationListner.getCityName()));
		if (locationListner.isLivesIn()) {
			CityLivesIn cityLivesIn = new CityLivesIn(locationListner.getCityName());
			ProfileId profileId = new ProfileId(locationListner.getProfileId(), cityLivesIn);
			profileIdRepository.save(profileId);

		} else {

			CityLivedIn cityLivedIn = new CityLivedIn(locationListner.getCityName());
			ProfileId profileId = new ProfileId(locationListner.getProfileId(), cityLivedIn);
			profileIdRepository.save(profileId);
		}

	}

	@KafkaListener(topics = "SkillIndexer1", groupId = "group_json", containerFactory = "skillKafkaListenerFactory")
	public void consumeJson(SkillListner skillListner) {
		System.out.println("Consumed JSON Message: " + skillListner);
		// cityRepository.findById(locationListner.getCityName());
		// System.out.println(cityRepository.findById(locationListner.getCityName()));
		Skill skill = new Skill(skillListner.getSkill());
		ProfileId profileId = new ProfileId(skillListner.getProfileId());
		HasSkill hasSkill = new HasSkill(skillListner.getWeightage(), profileId, skill);
		// profileIdRepository.save(profileId);
		hasSkillRepository.save(hasSkill);

	}

	@KafkaListener(topics = "TrainingIndexer", groupId = "group_json", containerFactory = "trainingKafkaListenerFactory")
	public void consumeJson(TrainingListner trainingListner) {
		System.out.println("Consumed JSON Message: " + trainingListner);
		// cityRepository.findById(locationListner.getCityName());
		// System.out.println(cityRepository.findById(locationListner.getCityName()));
		Skill skill = new Skill(trainingListner.getSkills());
		Training training = new Training(trainingListner.getTrainingId(), trainingListner.getTrainingName(),
				trainingListner.getAuthority());
		ProfileId profileId = new ProfileId(trainingListner.getProfileId());
		TrainingUndergone trainingUndergone = new TrainingUndergone(trainingListner.getDuration(), profileId, training);
		TrainingCoversSkill trainingCoversSkill = new TrainingCoversSkill(trainingListner.getWeight(), training, skill);
		// profileIdRepository.save(profileId);
		trainingUndergoneRepository.save(trainingUndergone);
		trainingCoversSkillRepository.save(trainingCoversSkill);
		//trainingCoversSkillRepository.delete(trainingCoversSkill);

	}

}
