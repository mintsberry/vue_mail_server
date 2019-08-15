package com.mint.vuemailserver.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class News {
    private long id;
    private String icon;
    private String title;
    private String content;
    private int type;
    private long click;
    private long comment;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date date;

//    public News(String icon, String title, String content, int type, long comment) {
//        this.icon = icon;
//        this.title = title;
//        this.content = content;
//        this.type = type;
//        this.comment = comment;
//    }


}
