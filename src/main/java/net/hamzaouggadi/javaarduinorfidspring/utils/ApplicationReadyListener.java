package net.hamzaouggadi.javaarduinorfidspring.utils;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationReadyListener implements ApplicationListener<ApplicationReadyEvent> {

    public static boolean isStarted = false;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("Application Started fully !");
        isStarted = true;
    }
}
