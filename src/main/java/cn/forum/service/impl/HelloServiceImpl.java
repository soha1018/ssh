package cn.forum.service.impl;

import cn.forum.dao.HelloDao;
import cn.forum.domain.Hello;
import cn.forum.service.HelloService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Resource(name = "helloDao")
    private HelloDao dao;
    @Override
    public void save(Hello hello) {
        dao.save(hello);
    }
}
