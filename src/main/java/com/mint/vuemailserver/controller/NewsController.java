package com.mint.vuemailserver.controller;

import com.mint.vuemailserver.dto.ResultDTO;
import com.mint.vuemailserver.enums.StatusCode;
import com.mint.vuemailserver.pojo.News;
import com.mint.vuemailserver.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.List;
@RestController
@CrossOrigin
public class NewsController {
    @Autowired
    NewsService newsService;
    @GetMapping("news")
    public ResultDTO<List<News>> getNews(){
        ResultDTO<List<News>> resultDTO = new ResultDTO<>();
        List<News> newsInfo = newsService.getNews();
        if (newsInfo != null && newsInfo.size() != 0){
            resultDTO.setData(newsInfo);
            resultDTO.setStatusCode(StatusCode.SUCCESS);
        } else {
            resultDTO.setStatusCode(StatusCode.LIST_EMPTY);
        }
        return resultDTO;
    }
    @GetMapping("news/{id}")
    public ResultDTO<News> getNewsInfo(@PathVariable int id){
        ResultDTO<News> resultDTO = new ResultDTO<>();
        News newsInfo = newsService.getNewsInfo(id);
        if (newsInfo != null){
            resultDTO.setStatusCode(StatusCode.SUCCESS);
            resultDTO.setData(newsInfo);
        } else {
            resultDTO.setStatusCode(StatusCode.NOT_FIND_NEWS);
        }
        return resultDTO;
    }

}
