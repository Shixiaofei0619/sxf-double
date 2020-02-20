package com.sxf.service;

import java.util.List;

import com.sxf.domain.Article;
import com.sxf.domain.Condition;


public interface ArticleService {

	List<Article> list(Condition con, int sortt);

}
