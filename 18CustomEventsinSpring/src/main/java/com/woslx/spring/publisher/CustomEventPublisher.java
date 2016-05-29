package com.woslx.spring.publisher;

import com.woslx.spring.beans.CustomEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by hy on 16-5-29.
 */
public class CustomEventPublisher
        implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher
            (ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publish() {
        CustomEvent ce = new CustomEvent(this);
        publisher.publishEvent(ce);
    }
}