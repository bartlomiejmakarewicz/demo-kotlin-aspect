package com.example.demokotlinaspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

@Aspect
@Component
class LogJoinPointAspect(val demoService: DemoService) {

    @Before("@annotation(LogJoinPoint) && execution(@LogJoinPoint * *(..))")
    fun determineRedirect(joinPoint: JoinPoint) {
        println(joinPoint)
        println(demoService.uuid)
    }
}