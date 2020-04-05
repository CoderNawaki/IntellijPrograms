package com.example.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
	@RequestMapping("/topic")
	public String getAllTopic() {
		return "All topics.";
	}
}
