package com.example.audit;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

@Aspect
@Component
public class AuditAspect {

    @Pointcut(value="execution(@Audit * *.*(..))")
    public void annotatedMethod() {
    }

    @AfterReturning(value = "annotatedMethod() && @annotation(Audit)")
    public void sendToAudit(JoinPoint point) throws IllegalAccessException, InstantiationException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        System.out.println(request.getHeader("Accept"));

        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        Audit audit = method.getAnnotation(Audit.class);
        Class<?> requestClass = audit.auditRequest();
        Object auditRequest = requestClass.newInstance();

        System.out.println(point.toLongString());
        Object[] argValues = point.getArgs();
        String[] parameterNames = signature.getParameterNames();
        //TODO zip them, find setters, fill request

        System.out.println(auditRequest.toString());
    }

    @AfterThrowing(
            value = "annotatedMethod() && @annotation(Audit)",
            throwing = "e"
    )
    public void sendToAuditException(JoinPoint point, Throwable e) throws IllegalAccessException, InstantiationException {
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        System.out.println(point.toLongString());

        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        Audit audit = method.getAnnotation(Audit.class);
        Class<?> requestClass = audit.auditRequest();
        Object o = requestClass.newInstance();
        System.out.println(o.toString());
    }
}
