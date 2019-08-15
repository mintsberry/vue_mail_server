package com.mint.vuemailserver.service;

import com.mint.vuemailserver.mapper.NewsMapper;
import com.mint.vuemailserver.pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class NewsService {
    @Autowired
    private NewsMapper newsMapper;
    public List<News> getNews(){
        List<News> news = newsMapper.selNews();
//        String[] title = new String[]{"我一出场，自带BGM", "虽然是野猫，也算捡猫了", "街头的酒emmm", "铅笔涂一个妹子", "【AC娘生日快乐】", "周五的夏日晚餐", "不同国家的零差评网红", "AMD 6核处理器现身Geekbench", "中国操作系统往事", "《切尔诺贝利》很好看"};
//        String[] content = new String[]{"Bgmmm", "捡猫之旅...", "DunDunDun", "妹子妹子妹子", "要快乐哦", "天太热，必须清爽", "世界之美在于发现", "最高3.99GHz，16MB 三级缓存", "0年沉浮过后，操作系统走到新的十字路口，中国国产操作系统会迎来突围机会吗？", "人们真遇到核爆该咋办？"};
//        Integer[] type = new Integer[]{1,2,1,3,1,1,2,3,3,1};
//        for (int i = 0; i < 10; i++){
//            News newsInfo = new News("http://192.168.1.177:8081/images/icon" + i + ".jpg", title[i], content[i], type[i], new Random().nextInt(100));
//            news.add(newsInfo);
//        }
        return news;
    }

    public News getNewsInfo(int id) {
        News news = newsMapper.selNewsById(id);
        return news;
    }
}
