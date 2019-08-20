package com.mint.vuemailserver.service;

import com.mint.vuemailserver.pojo.Goods;
import com.mint.vuemailserver.pojo.SwipeImages;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

//private long id;
//private String title;
//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
//private Date add_time;
//private String introduction;
//private String ima_url;
//private float sell_price;
//private float marker_price;
//private int click;
//private int quantity;
@Service
public class GoodsService {
    private long[] id = {1,2,3,4,5,6,7,8,9,10,11,12};
    private String[] title = {"微风","水响蝉鸣","我好想耽误你嗷","夏日清爽","凉城夏日","在雨中与你相遇","微风","水响蝉鸣","我好想耽误你嗷","夏日清爽","凉城夏日","在雨中与你相遇"};
    private String[] img = {"http://p2.music.126.net/ctmDITxmQZ4bIhawwlq5dA==/109951164265461140.jpg?param=140y140","http://p4.music.126.net/hmoaKigHcbJq2bYW45_jdg==/109951163983266319.jpg?param=200y200",
            "http://p2.music.126.net/h8KhYHviae2n-K4YWRBhog==/109951164224111133.jpg?param=140y140","http://p1.music.126.net/2aG4hRrGmCe5Q86ouJ-auQ==/109951164114946373.jpg?param=140y140","http://p1.music.126.net/vK-Zcszp7X2PVg4ZHujglg==/109951164062857612.jpg?param=140y140","" +
            "http://p2.music.126.net/tsOcjizy8Wi4xK1aAHirVg==/109951164227044177.jpg?param=140y140","http://p2.music.126.net/ctmDITxmQZ4bIhawwlq5dA==/109951164265461140.jpg?param=140y140","http://p4.music.126.net/hmoaKigHcbJq2bYW45_jdg==/109951163983266319.jpg?param=200y200",
            "http://p2.music.126.net/h8KhYHviae2n-K4YWRBhog==/109951164224111133.jpg?param=140y140","http://p1.music.126.net/2aG4hRrGmCe5Q86ouJ-auQ==/109951164114946373.jpg?param=140y140","http://p1.music.126.net/vK-Zcszp7X2PVg4ZHujglg==/109951164062857612.jpg?param=140y140","" +
            "http://p2.music.126.net/tsOcjizy8Wi4xK1aAHirVg==/109951164227044177.jpg?param=140y140"};
    private float[] sellPrice = {2999,1999,2999,3999,1999,2999,1233,4288,2999,1999,2999,3999,1999,2999,1233,4288};
    private float[] markerPrice = {3999,2999,1888,3888,4999,3999,1455,49993999,2999,1888,3888,4999,3999,1455,4999};
    private int[] quantity = {57,23,68,45,23,69,34,57,23,68,45,23,69,34,57,23,68,45,23,69,34};


    public List<Goods> selGoodsByIndex(int pageIndex) {
        List<Goods> goodsList = new ArrayList<>();

        int start = (pageIndex-1) * 6;
        int last = start + 6 < id.length ? start + 6 : id.length;
        for (; start < last; start++) {
            Goods goods = new Goods();
            goods.setId(id[start]);
            goods.setTitle(title[start]);
            goods.setImg_url(img[start]);
            goods.setSell_price(sellPrice[start]);
            goods.setMarker_price(markerPrice[start]);
            goods.setQuantity(quantity[start]);
            goodsList.add(goods);
        }
        return goodsList;
    }

    public List<SwipeImages> selImagesById(int id) {
        List<SwipeImages> swipeImagesList = new ArrayList<>();
        SwipeImages swipeImages = new SwipeImages();
        if (id < img.length){
            swipeImages.setUrl(img[id-1]);
        }
        swipeImagesList.add(swipeImages);
        for (int i = 0; i < 2; i++){
            swipeImages = new SwipeImages();
            int rn = new Random().nextInt(img.length);
            swipeImages.setUrl(img[rn]);
            swipeImagesList.add(swipeImages);
        }
        return swipeImagesList;
    }

    public Goods selGoodsById(int id) {
        Goods goods = new Goods();
        goods.setId(id);
        goods.setQuantity(quantity[id-1]);
        goods.setMarker_price(markerPrice[id-1]);
        goods.setSell_price(sellPrice[id-1]);
        goods.setTitle(title[id-1]);
        goods.setAdd_time(new Date(System.currentTimeMillis()));
        goods.setIntroduction("Lalala，快来买呀");
        return goods;
    }
}
