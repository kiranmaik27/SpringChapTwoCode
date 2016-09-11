package com.spring;

/**
 * Created by aditya on 9/10/2016.
 */
public class HelloWorldDecoupled {
    public static void main(String[] args){
        MessageRenderer mr = new StandardoutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
