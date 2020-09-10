package com.ripal.rest.webservices.restfulwebservices.post;

import java.util.Date;

public class Post {

    private int post_id;
    private int user_id;
    private String post_name;

    private Date post_time;

    public Post() {
    }

    public Post(int post_id, int user_id, String post_name, Date post_time) {
        this.post_id = post_id;
        this.user_id = user_id;
        this.post_name = post_name;
        this.post_time = post_time;
    }


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }


    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public Date getPost_time() {
        return post_time;
    }

    public void setPost_time(Date post_time) {
        this.post_time = post_time;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", user_id=" + user_id +
                ", post_name='" + post_name + '\'' +
                ", post_time=" + post_time +
                '}';
    }
}
