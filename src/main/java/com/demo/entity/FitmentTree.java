package com.demo.entity;

import lombok.Data;

import java.util.List;
@Data
public class FitmentTree {

    private String id;

    private String pid;


    private String name;

    private  String level;

    private List<FitmentTree> children;
}
