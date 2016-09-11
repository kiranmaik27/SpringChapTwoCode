package com.spring;

/**
 * Created by aditya on 9/10/2016.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
