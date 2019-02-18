package com.zl.springbootmybatis.entity;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-17 15:56
 */
public class Blog {
    private int id ;
    private String title;
    private Author author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
