package com.example.audit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотированный метод будет оставлять след в аудите. Необходимые параметры должны присутствовать в аргументах метода,
 * имена должны совпадать с полями класса *Special, указанного в параметре auditRequest
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Audit {

    /**
     * Событие, отправляемое в аудит
     * @return
     */
    Class<?> auditRequest();
}
