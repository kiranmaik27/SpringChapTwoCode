package com.spring;

/**
 * Created by aditya on 9/10/2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage(){ return "HelloWorld"; }
}
