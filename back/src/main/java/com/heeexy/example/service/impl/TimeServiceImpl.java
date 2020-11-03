package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.TimeDao;
import com.heeexy.example.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeServiceImpl implements TimeService {
    @Autowired
    private TimeDao timeDao;

    @Override
    public JSONObject addTime(JSONObject requestJson) {
        List<Integer> sendTime=(List<Integer>)requestJson.get("sendTime");
        for (Integer s:sendTime) {
            System.out.println(s);
        }
        return null;
    }
}
