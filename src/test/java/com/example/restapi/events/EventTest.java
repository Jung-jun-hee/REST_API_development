package com.example.restapi.events;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EventTest {
	@Test
	public void builder() {
		Event event =  Event.builder()
					 .name("junhee")
					 .description("REST API development with Spring")
					 .build();
		
		assertThat(event).isNotNull();
		
	}
	
	// Builder패턴 뿐만이 아니라 Java Bean 스펙도 존중해야함
	@Test
	public void javaBean() {
		// Given
		Event event = new Event();
		
		// When
		String name = "junhee"; // 코드 리펙토링
		String description = "Spring";
		event.setName(name);
		event.setDescription(description);
		
		//Then
		assertThat(event.getName()).isEqualTo(name);
		assertThat(event.getDescription()).isEqualTo(description);
	}
}
