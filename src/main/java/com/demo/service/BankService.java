package com.demo.service;

import com.demo.entity.BankTree;

import java.util.List;

public interface BankService {
    List<BankTree> getTree(String idd);

}
