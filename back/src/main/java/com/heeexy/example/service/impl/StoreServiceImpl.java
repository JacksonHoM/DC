package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.StoreDao;
import com.heeexy.example.service.StoreService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreDao storeDao;

    @Override
    public JSONObject findAll(JSONObject jsonObject) {
        JSONObject js=(JSONObject) SecurityUtils.getSubject().getSession().getAttribute(Constants.SESSION_USER_INFO);
        jsonObject.put("userId",js.get("userId"));
        CommonUtil.fillPageParam(jsonObject);
        int count = storeDao.countUser(jsonObject);
        List<JSONObject> list = storeDao.findAll(jsonObject);
        return CommonUtil.successPage(jsonObject,list,count);
    }
}
