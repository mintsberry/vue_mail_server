package com.mint.vuemailserver.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class Goods {
    private long id;
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date add_time;
    private String introduction;
    private String img_url;
    private float sell_price;
    private float marker_price;
    private int click;
    private int quantity;
}
