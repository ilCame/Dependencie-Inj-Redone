package com.dependency.injection.rebuild.dir;

import com.dependency.injection.rebuild.dir.controllers.MyController;
import com.dependency.injection.rebuild.dir.controllers.PropertyInjectionController;
import com.dependency.injection.rebuild.dir.controllers.SettingInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.dependency.injection"})
@SpringBootApplication
public class DirApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(DirApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("---- Primary Bean ----");
		PropertyInjectionController propertyInjectionController = (PropertyInjectionController)  ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());

		System.out.println("----    Setter    ----");
		SettingInjectedController settingInjectedController = (SettingInjectedController) ctx.getBean("settingInjectedController");
		System.out.println(settingInjectedController.getGreeting());
	}

}
