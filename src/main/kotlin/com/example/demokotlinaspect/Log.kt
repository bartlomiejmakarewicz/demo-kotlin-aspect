package com.example.demokotlinaspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class Redirect

@Aspect
@Component
class RedirectAspect(val demoService: DemoService) {

    @Before("@annotation(Redirect) && execution(@Redirect * *(..))")
    fun determineRedirect(joinPoint: JoinPoint) {
        println(joinPoint)
        println(demoService.uuid)
    }
}