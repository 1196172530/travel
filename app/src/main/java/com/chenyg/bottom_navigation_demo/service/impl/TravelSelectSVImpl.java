package com.chenyg.bottom_navigation_demo.service.impl;

import com.chenyg.bottom_navigation_demo.entity.TravelMessage;
import com.chenyg.bottom_navigation_demo.service.interfaces.ITravelSelectSV;

import java.util.ArrayList;
import java.util.List;

public class TravelSelectSVImpl implements ITravelSelectSV {
    @Override
    public List<TravelMessage> getAllTravelMessage() {
        List<TravelMessage> list = new ArrayList<TravelMessage>();
        //模拟网络请求获取数据
        for(int i = 0; i < 100 ; i++){
            TravelMessage travelMessage = new TravelMessage();
            travelMessage.setCommentNum("CommentNum"+i);
            travelMessage.setGrade("Grade"+i);
            travelMessage.setName("Name"+i);
            travelMessage.setTravelImgUrl("TravelImgUrl"+i);
            travelMessage.setType("Type"+i);
            list.add(travelMessage);
        }
        return list;
    }



}

