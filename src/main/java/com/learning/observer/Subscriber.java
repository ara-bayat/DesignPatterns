package com.learning.observer;

public interface Subscriber {
    void update(String channelName, String videoTitle);
}
