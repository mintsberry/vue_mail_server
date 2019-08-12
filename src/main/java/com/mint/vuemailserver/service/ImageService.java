package com.mint.vuemailserver.service;

import com.mint.vuemailserver.pojo.SwipeImages;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ImageService {
    public List<SwipeImages> getSwipes(){
        String path = "http://192.168.1.177:8081/images/";
        List<SwipeImages> images = new ArrayList<>();
        SwipeImages swipeImages = new SwipeImages();
        swipeImages.setImage(path + "dark.jpg");
        swipeImages.setUrl("#");
        images.add(swipeImages);
        swipeImages = new SwipeImages();
        swipeImages.setImage(path + "castle.jpg");
        swipeImages.setUrl("#");
        images.add(swipeImages);
        swipeImages = new SwipeImages();
        swipeImages.setImage(path + "wind.jpg");
        swipeImages.setUrl("#");
        images.add(swipeImages);
        return images;
    }
}
