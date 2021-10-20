package com.demo.mapper;

import com.demo.entity.Tree;
import com.demo.entity.FitmentTree;

import java.util.List;

public interface TreeMapper {
    List<Tree>  findAll();

    List<FitmentTree> selectTree();

}
