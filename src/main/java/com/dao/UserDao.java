package com.dao;

import com.core.BaseDao;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by chenjunjun on 16/1/18 22:52
 */
public class UserDao extends BaseDao {
    public UserDao(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }


}
