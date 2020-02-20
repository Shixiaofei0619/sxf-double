package com.sxf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sxf.domain.Article;
import com.sxf.domain.Condition;


public interface ArticleMapper {

	List<Article> list(@Param("con")Condition con, @Param("sortt")int sortt);

}
