package com.chenyg.bottom_navigation_demo.entity;

public class TravelMessage {
    //景区名称
    private String name;
    //评分
    private String grade;
    //景点类型
    private String type;
    //评论条数
    private String commentNum;
    //景区图片
    private String TravelImgUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public String getTravelImgUrl() {
        return TravelImgUrl;
    }

    public void setTravelImgUrl(String travelImgUrl) {
        TravelImgUrl = travelImgUrl;
    }
}
