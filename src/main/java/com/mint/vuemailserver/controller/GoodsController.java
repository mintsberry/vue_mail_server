package com.mint.vuemailserver.controller;

import com.mint.vuemailserver.dto.ResultDTO;
import com.mint.vuemailserver.enums.StatusCode;
import com.mint.vuemailserver.pojo.Goods;
import com.mint.vuemailserver.pojo.SwipeImages;
import com.mint.vuemailserver.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @GetMapping("/goods")
    public ResultDTO<List<Goods>> goods(@RequestParam(name="pageIndex", defaultValue = "1") int pageIndex){
        ResultDTO<List<Goods>> resultDTO = new ResultDTO<>();
        List<Goods> goods = goodsService.selGoodsByIndex(pageIndex);
        if (goods != null && goods.size() != 0) {
            resultDTO.setData(goods);
            resultDTO.setStatusCode(StatusCode.SUCCESS);
        } else {
            resultDTO.setStatusCode(StatusCode.NOT_FIND_GOODS);
        }
        return resultDTO;
    }

    @GetMapping("/goods/{id}")
    public ResultDTO<Goods> goodsDetail(@PathVariable int id){
        ResultDTO<Goods> resultDTO = new ResultDTO<>();
        Goods goods = goodsService.selGoodsById(id);
        if (goods != null) {
            resultDTO.setData(goods);
            resultDTO.setStatusCode(StatusCode.SUCCESS);
        } else {
            resultDTO.setStatusCode(StatusCode.NOT_FIND_GOODS);
        }
        return resultDTO;
    }

    @GetMapping("/goodsImages/{id}")
    public ResultDTO<List<SwipeImages>> goodsImages(@PathVariable int id){
        ResultDTO<List<SwipeImages>> resultDTO = new ResultDTO<>();
        List<SwipeImages> swipeImages = goodsService.selImagesById(id);
        if (swipeImages != null && swipeImages.size() > 0){
            resultDTO.setData(swipeImages);
            resultDTO.setStatusCode(StatusCode.SUCCESS);
        }
        return resultDTO;
    }
}
