package com.annotation;

import java.lang.annotation.*;

/**
 * Created by OnlyAnywhere on 15/12/10.
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggingLog {
    String value() default "";
}
