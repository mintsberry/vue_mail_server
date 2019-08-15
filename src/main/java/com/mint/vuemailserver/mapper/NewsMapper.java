package com.mint.vuemailserver.mapper;

import com.mint.vuemailserver.pojo.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsMapper {
    @Select("select * from news")
    List<News> selNews();
    @Select("select * from news where id = #{id}")
    News selNewsById(int id);
}
