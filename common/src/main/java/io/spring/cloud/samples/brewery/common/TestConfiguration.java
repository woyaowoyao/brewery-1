package io.spring.cloud.samples.brewery.common;

import brave.sampler.Sampler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;

@Configuration
@ComponentScan
@IntegrationComponentScan
public class TestConfiguration {

	@Bean Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
