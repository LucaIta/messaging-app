package com.example.guest.instantmessagingapp.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 7/14/16.
 */
public class User {
    String name;
    List<String> threads = new ArrayList<>();
    String pushId;

    public User (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getThreads() {
        return threads;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

}


