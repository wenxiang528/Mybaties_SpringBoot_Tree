package com.demo.service;

import com.demo.entity.Tree;
import com.demo.entity.FitmentTree;

import java.util.List;

public interface TreeService {

    List<Tree> findAll();

    List<FitmentTree> getTree(String idd);
}
