package com.stackroute.indexer.configurations;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.stackroute.indexer.trail1.nodes.LocationListner;
import com.stackroute.indexer.trail1.nodes.SkillListner;
import com.stackroute.indexer.trail1.nodes.TrainingListner;

@EnableKafka
@Configuration
public class KafkaConfiguration {

	@Bean
	public ConsumerFactory<String, String> consumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "0.0.0.0:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

		return new DefaultKafkaConsumerFactory<>(config);
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<String, String>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, LocationListner> locationConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(LocationListner.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, LocationListner> locationKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, LocationListner> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(locationConsumerFactory());
		return factory;
	}

	@Bean
	public ConsumerFactory<String, SkillListner> skillConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(SkillListner.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, SkillListner> skillKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, SkillListner> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(skillConsumerFactory());
		return factory;
	}
	@Bean
	public ConsumerFactory<String, TrainingListner> trainingConsumerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
				new JsonDeserializer<>(TrainingListner.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, TrainingListner> trainingKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, TrainingListner> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(trainingConsumerFactory());
		return factory;
	}

}
