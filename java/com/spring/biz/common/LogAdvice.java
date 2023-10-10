package com.spring.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import com.spring.biz.member.MemberVO;

@Service
@Aspect
public class LogAdvice {
	@Before("PointCutCommon.beforePointcut()")
	public void beforeLog() {
		System.out.println("[횡단관심]");
		System.out.println("  비즈니스 메서드 수행 전에 호출됨");
	}
	
	@After("PointCutCommon.afterPointcut()")
	public void afterLog() {
		System.out.println("[횡단관심]");
		System.out.println("  비즈니스 메서드 수행 후에 호출됨");
		System.out.println();
	}
	
}
