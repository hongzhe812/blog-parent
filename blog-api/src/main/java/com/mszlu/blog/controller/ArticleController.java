package com.mszlu.blog.controller;

import com.mszlu.blog.vo.Pageparams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Json数据进行交互
@RestController
@RequestMapping("articles")
public class ArticleController {
    /**
     * 首页 文章列表
     * @param pageparams
     * @return
     */

    @PostMapping
    public void listArticle(@RequestBody Pageparams pageparams){

    }
}
