package com.spring;

/**
 * Created by aditya on 9/10/2016.
 */
public class HelloWorldDecoupledWithFactory {
    public static void main (String[] args){
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
