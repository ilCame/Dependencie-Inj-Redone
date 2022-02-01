package com.dependency.injection.rebuild.dir.controllers;

import com.dependency.injection.rebuild.dir.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
