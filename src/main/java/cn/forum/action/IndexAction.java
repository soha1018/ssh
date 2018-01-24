package cn.forum.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("indexAction")
@Scope("prototype")
public class IndexAction extends ActionSupport {
    public String index(){
        return SUCCESS;
    }
}
