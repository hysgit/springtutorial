package com.woslx.spring.eventshandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * Created by hy on 16-5-28.
 */
public class CStopEventHandler
        implements ApplicationListener<ContextStoppedEvent> {

    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent Received. 事件源："+event.getSource());
    }
}
