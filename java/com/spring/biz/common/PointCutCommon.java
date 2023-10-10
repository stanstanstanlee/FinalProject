package com.spring.biz.common;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutCommon {
	@Pointcut("execution(* com.spring.biz..*Impl.*(..))")
	public void beforePointcut() {}
	@Pointcut("execution(* com.spring.biz..*Impl.select*(..))")
	public void afterPointcut() {}
}
