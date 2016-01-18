package core;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by OnlyAnywhere on 15/12/6.
 */

public class BaseDao extends SqlSessionTemplate {

    public BaseDao(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

}
