package com.example.restapi.events;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder @AllArgsConstructor @NoArgsConstructor
@Getter @Setter @EqualsAndHashCode(of = "id")
public class Event {
	private Integer id; 
	private String name;		// 이벤트 이름 
	private String description; // 이벤트 기술
	private LocalDateTime beginEnrollmentDateTime; // 등록 시작일시
	private LocalDateTime closeEnrollmentDateTime; // 등록 종료일시
	private LocalDateTime beginEventDateTime; // 이벤트 시작일시
	private LocalDateTime endEventDateTime; // 이벤트 종료일시
	private String location;	// 위치
	private int basePrice;		
	private int maxPrice;
	private int limitOfEnrollment;
	private boolean offline;
	private boolean free;
	private EventStatus eventStatus; //enum
}
