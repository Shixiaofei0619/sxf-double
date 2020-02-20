package com.sxf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxf.dao.ArticleMapper;
import com.sxf.domain.Article;
import com.sxf.domain.Condition;
import com.sxf.service.ArticleService;


@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	ArticleMapper articleMapper;
	
	public List<Article> list(Condition con, int sortt) {
		return articleMapper.list(con,sortt);
	}

}
