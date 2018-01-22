package cn.forum.dao.impl;

import cn.forum.dao.HelloDao;
import cn.forum.domain.Hello;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("helloDao")
public class HelloDaoImpl extends BaseDaoImpl<Hello> implements HelloDao {
    @Resource(name = "sessionFactory")
    public void setSF(SessionFactory factory) {
        super.setSessionFactory(factory);
    }
}
