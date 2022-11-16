package com.abp;

import com.abp.service.DemoService;
import com.abp.service.LocationService;
import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLException;


@SpringBootApplication
public class App {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

//        context.close();

        try {
            Console.main(args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}