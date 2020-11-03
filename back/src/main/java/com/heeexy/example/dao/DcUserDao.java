package com.heeexy.example.dao;


import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface DcUserDao {

    int countUser(JSONObject jsonObject);

    List<JSONObject> findAll(JSONObject jsonObject);

    int updateUser(JSONObject jsonObject);

    int addAddr(JSONObject jsonObject);
}
