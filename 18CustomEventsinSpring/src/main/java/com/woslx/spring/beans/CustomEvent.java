package com.woslx.spring.beans;

import org.springframework.context.ApplicationEvent;

/**
 * Created by hy on 16-5-29.
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public String toString(){
        return "My Custom Event";
    }
}
