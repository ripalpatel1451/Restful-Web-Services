package com.ripal.rest.webservices.restfulwebservices.post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostDaoService {

    private static List<Post> posts = new ArrayList<>();
    private static int postCount = 3;

    static {
        posts.add(new Post(1, 2,"General", new Date()));
        posts.add(new Post(2,2,"personal", new Date()));
        posts.add(new Post(3,1,"Restricted", new Date()));
    }

//    public List<Post> findAllPosts(int user_id){
//
//    }


}
