package com.cache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//必须接口加才会生效
//用来标识需要缓存数据的Key    cacheKeyPre() + CacheKey  就是真正的Key
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.PARAMETER })
public @interface CacheKey {
}