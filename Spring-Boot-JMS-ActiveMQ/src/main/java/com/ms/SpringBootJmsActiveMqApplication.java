package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SpringBootJmsActiveMqApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJmsActiveMqApplication.class, args);
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
		jmsTemplate.convertAndSend("Chuman", "hi this active mq test");
	}
}
