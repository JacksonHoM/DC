package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface StoreDao {
    int countUser(JSONObject jsonObject);

    List<JSONObject> findAll(JSONObject jsonObject);
}
