package com.sopra.springboot.app.component;

import java.util.Date;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("taskComponent")
public class TaskComponent 
{
	private static final Log LOG = LogFactory.getLog(TaskComponent.class);
	
	@Scheduled(fixedDelay=15000)//Significa que es un componente de batch
	public void doTask()
	{
		LOG.info("Fecha, Hora y Año actuales: " + new Date());
	}
}
