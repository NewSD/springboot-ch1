package com.niu.springboot.controller;

import com.niu.springboot.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ami on 2019/6/10.
 */
@RestController
public class BookController {
    @Autowired
    Book book;
    @GetMapping("/book")
    public String book(){
        return book.toString();
    }
}
