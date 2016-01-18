package com.cache;

import java.lang.annotation.*;

/**
 * Created by chenjunjun on 16/1/18 23:14
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
@Documented
public @interface CacheProcess {
    /**
     * 指明缓存KEY的前缀
     *
     * @return
     */
    public String cacheKeyPre() default "";

    /**
     * 指明缓存类型。根据类型不同，可缓存字符串(任何对象均可被缓存，都将被转为JSON格式的字符串)值和有序集合值
     *
     * @return
     */
    public CacheType cacheType() default CacheType.String;

    /**
     * 缓存多少秒,默认无限期
     *
     * @return
     */
    public int expire() default 0;

}
