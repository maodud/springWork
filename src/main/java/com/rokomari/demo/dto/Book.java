package com.rokomari.demo.dto;

public class Book {
    private String name;
    private String page;

    public Book() {

    }

    public Book(String name, String page) {
        this.name = name;
        this.page = page;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public String getPage() {
        return page;
    }
}
