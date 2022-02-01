package com.dependency.injection.rebuild.dir.controllers;


import com.dependency.injection.rebuild.dir.services.GreetingService;

public class PropertyInjectionController {

    private GreetingService greetingService;

    public String getGreeting() {

        return greetingService.sayGreeting();
    }
}
