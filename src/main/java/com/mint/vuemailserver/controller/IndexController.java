package com.mint.vuemailserver.controller;

import com.mint.vuemailserver.dto.ResultDTO;
import com.mint.vuemailserver.enums.StatusCode;
import com.mint.vuemailserver.pojo.SwipeImages;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {
    @GetMapping("/swipe")
    public ResultDTO<List<SwipeImages>> swipe(){
        ResultDTO<List<SwipeImages>> resultDTO = new ResultDTO<>();
        List<SwipeImages> list = new ArrayList<>();
        resultDTO.setData(list);
        resultDTO.setStatusCode(StatusCode.SUCCESS);
        return resultDTO;
    }
}
