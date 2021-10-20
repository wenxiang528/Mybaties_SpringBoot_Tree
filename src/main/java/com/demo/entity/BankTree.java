package com.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class BankTree {
    private String id;

    private String pid;

    private String bankName;

    private  String level;

    private List<BankTree> children;


}
