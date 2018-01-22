package cn.forum.action;

import cn.forum.domain.Hello;
import cn.forum.service.HelloService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("helloAction")
@Scope("prototype")
public class HelloAction extends ActionSupport implements ModelDriven<Hello> {
    private Hello hello = new Hello();
    @Resource(name = "helloService")
    private HelloService service;

    public String register(){

        System.out.println(hello);
        service.save(hello);
        return SUCCESS;
    }
    @Override
    public Hello getModel() {
        return hello;
    }
}
