package com.mint.vuemailserver.controller;

import com.mint.vuemailserver.dto.ResultDTO;
import com.mint.vuemailserver.enums.StatusCode;
import com.mint.vuemailserver.pojo.News;
import com.mint.vuemailserver.pojo.SwipeImages;
import com.mint.vuemailserver.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@CrossOrigin
public class IndexController {
    @Autowired
    ImageService imageService;
    @GetMapping("/swipe")
    public ResultDTO<List<SwipeImages>> swipe(){
        ResultDTO<List<SwipeImages>> resultDTO = new ResultDTO<>();
        List<SwipeImages> list = imageService.getSwipes();
        resultDTO.setData(list);
        if (list == null || list.size() == 0){
            resultDTO.setStatusCode(StatusCode.LIST_EMPTY);
        } else {
            resultDTO.setStatusCode(StatusCode.SUCCESS);
        }
        return resultDTO;
    }


}
