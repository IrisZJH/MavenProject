package com.zjh.ssmpro.handler;

import com.zjh.ssmpro.entity.Visitor;
import com.zjh.ssmpro.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 18221 on 2018/10/11.
 */
@RequestMapping("visitor")
@Controller
public class VisitorHandler {
    @Autowired
    private VisitorService visitorService;

    @RequestMapping("addVisitor")
    public String addVisitor(Visitor visitor){
        visitorService.addVisitor(visitor);
        return "forward:";
    }

    @RequestMapping("findVisitorByNameAndPassword")
    public Visitor findVisitorByNameAndPassword(String name,String password){
        Visitor visitor = visitorService.findVisitorByNameAndPassword(name,password);
        return visitor;
    }
}
