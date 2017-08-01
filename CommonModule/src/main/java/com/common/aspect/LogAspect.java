package com.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.common.aspect.annotations.AspectLoggable;

@Aspect
@Configuration
@EnableAspectJAutoProxy
public class LogAspect {

	private static Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	@Around(value="execution(@vis.common.aspect.annotations.AspectLoggable * *(..)) && @annotation(aspectLoggable)")
	public Object logMethod(ProceedingJoinPoint joinPoint, AspectLoggable aspectLoggable) throws Throwable{
		logger.info("method: " + joinPoint.getSignature() + " init :: " );
		long startTime = System.currentTimeMillis();
		Object returnObject = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		long executionTime= (endTime-startTime);
		logger.info("method: " + joinPoint.getSignature() + " end :: executionTime : " + executionTime );
		return returnObject;
	}


}