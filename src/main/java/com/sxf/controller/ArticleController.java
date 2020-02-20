package com.sxf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxf.domain.Article;
import com.sxf.domain.Condition;
import com.sxf.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	ArticleService articleService;

	@RequestMapping
	public String list(Model model,Condition con,@RequestParam(defaultValue="1")int sortt,@RequestParam(defaultValue="1")int pageNum){
		
		PageHelper.startPage(pageNum,5);
		
		List<Article> list = articleService.list(con,sortt);
		
		PageInfo<Article> pageInfo = new PageInfo<Article>(list);
		
		model.addAttribute("list", list);
		model.addAttribute("page", pageInfo);
		model.addAttribute("t1", con.getT1());
		model.addAttribute("t2", con.getT2());
		model.addAttribute("sortt", sortt);
		
		return "list";
	}
	
}
