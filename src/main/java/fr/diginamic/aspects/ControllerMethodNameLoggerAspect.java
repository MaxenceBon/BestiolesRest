package fr.diginamic.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerMethodNameLoggerAspect {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@After("execution(* fr.diginamic.controller..get*(..)))")
	public void greffonAllGet(JoinPoint joinPoint) {
	logger.info("test");
	}
	
	@After("within(public fr.diginamic.controller..*)")
	public void greffonPublicGet(JoinPoint joinPoint) {
	logger.info("Executing controller method {}", joinPoint.getSignature().getName());
	}
	
	@AfterThrowing("execution(public fr.diginamic.service.AnimalService.create())")
	public void saveException(JoinPoint joinPoint) {
		logger.info("Threw exception", joinPoint.getSignature().getName());
	}

	
}
