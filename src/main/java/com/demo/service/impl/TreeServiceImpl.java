package com.demo.service.impl;

import com.demo.entity.Tree;
import com.demo.entity.FitmentTree;
import com.demo.mapper.TreeMapper;
import com.demo.service.TreeService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {
    @Resource
    private TreeMapper treeMapper;

    @Override
    public List<Tree> findAll() {
        List<Tree> data = treeMapper.findAll();
        return data;
    }

@Override
    public List<FitmentTree> getTree(String idd) {

        List<FitmentTree> allList = treeMapper.selectTree();
        List<FitmentTree> treeList = new ArrayList<>();
//        不传值默认查询整个树

            for (FitmentTree vo : allList) {
//            不传值值时，默认查询整个树，寻找根节点
                if (null==idd||"".equals(idd)) {
                    if ("0".equals(vo.getPid())) {
                        vo.setChildren(getChildrenNode(vo.getId(), allList));
                        treeList.add(vo);
                    }
                }
                else{
//                    查询部分树
                    if (idd.equals(vo.getId())) {
                        vo.setChildren(getChildrenNode(vo.getId(), allList));
                        treeList.add(vo);
                    }
                }


        }

        return treeList;
    }

    /**
     * 递归获取子节点下的子节点
     *
     * @param pidd   父节点的ID
     * @param treesList 所有菜单树集合
     * @return
     */
    public List<FitmentTree>  getChildrenNode(String pidd, List<FitmentTree> treesList) {
        List<FitmentTree> newTrees = new ArrayList<FitmentTree>();
        for (FitmentTree department : treesList) {
//            if ("0".equals(department.getPid())) {
//                continue;
//            }
            if (department.getPid().equals(pidd)) {
                // 递归获取子节点下的子节点，即设置树控件中的children
                department.setChildren(getChildrenNode(department.getId(), treesList));
                newTrees.add(department);
            }
        }
        return newTrees;
    }

}
