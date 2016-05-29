package com.woslx.spring.handler;

import com.woslx.spring.beans.CustomEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by hy on 16-5-29.
 */
public class CustomEventHandler
        implements ApplicationListener<CustomEvent> {

    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }

}
