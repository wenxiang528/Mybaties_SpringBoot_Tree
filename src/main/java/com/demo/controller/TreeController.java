package com.demo.controller;

import com.demo.entity.Tree;
import com.demo.entity.FitmentTree;
import com.demo.service.TreeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/tree")
public class TreeController {
    @Resource
    private TreeService treeService;

    @RequestMapping("/findAll")
    List<Tree> findAll(HttpServletRequest request){
        String name=request.getParameter("name");
        return treeService.findAll();
    }


//    获取树类型的数据
    @RequestMapping("/getTree")
    List<FitmentTree> getTree(String idd){
        return  treeService.getTree(idd);
    }



}
