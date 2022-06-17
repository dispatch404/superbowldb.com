package com.superbowldb.aspect;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ClientResourceAspect {
	Logger log = LoggerFactory.getLogger(ClientResourceAspect.class);
	
	@Before(value= "execution(* com.superbowldb.resource.ClientResource.*(..))")
	public void applicationLogger(JoinPoint pjp) {
		String methodName = pjp.getSignature().getName();
		String className = pjp.getTarget().getClass().toString();
		//DateTime 
		
		log.info("method invoked " + className + " : " + methodName + " at " + LocalDateTime.now());
		
		try {
			File logFile = new File("logs/clientController.log");
			if(!logFile.exists()) {
				logFile.createNewFile();
			}
			try (FileWriter logWriter = new FileWriter("logs/clientController.log", true)) {
				logWriter.append("method invoked " + className + " : " + methodName + " at " + LocalDateTime.now() + '\n');
			}
			
		} catch(IOException e) {
			log.info("Log file error occured");
		}
	}
}
