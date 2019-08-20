package com.mint.vuemailserver.service;

import com.mint.vuemailserver.pojo.SwipeImages;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ImageService {
    public List<SwipeImages> getSwipes(){
        String path = "http://localhost:8081/images/";
        List<SwipeImages> images = new ArrayList<>();
        SwipeImages swipeImages = new SwipeImages();
        swipeImages.setUrl(path + "dark.jpg");
        swipeImages.setImage("#");
        images.add(swipeImages);
        swipeImages = new SwipeImages();
        swipeImages.setUrl(path + "castle.jpg");
        swipeImages.setImage("#");
        images.add(swipeImages);
        swipeImages = new SwipeImages();
        swipeImages.setUrl(path + "wind.jpg");
        swipeImages.setImage("#");
        images.add(swipeImages);
        return images;
    }
}
