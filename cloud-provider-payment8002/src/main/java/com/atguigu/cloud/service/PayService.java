package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Pay;

import java.util.List;

/**
 * @author starlord
 * @description
 * @create 2024/10/30
 */
public interface PayService {

    public int add(Pay pay);

    public int delete(Integer id);

    public Pay getById(Integer id);

    public int update(Pay pay);

    public List<Pay> getAll();
}