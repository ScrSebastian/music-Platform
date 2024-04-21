package com.example.musicplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.musicplatform.mapper")
@ComponentScan("com.example.musicplatform.config")
public class MusicplatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicplatformApplication.class, args);
    }

}
