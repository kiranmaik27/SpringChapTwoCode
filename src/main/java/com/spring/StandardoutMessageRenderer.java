package com.spring;

/**
 * Created by aditya on 9/10/2016.
 */
public class StandardoutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render(){
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvide of the class:"
                    + StandardoutMessageRenderer.class.getName());

        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) { this.messageProvider = provider; }

    @Override
    public MessageProvider getMessageProvider(){ return this.messageProvider; }
}
