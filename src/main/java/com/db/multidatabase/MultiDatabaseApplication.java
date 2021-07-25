package com.db.multidatabase;

import com.db.multidatabase.user.service.MyUserService;
import com.db.multidatabase.user.service.PostUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class MultiDatabaseApplication implements CommandLineRunner {

    @Autowired
    PostUserService postUserService;

    @Autowired
    MyUserService myUserService;

    public static void main( String[] args ) {
        SpringApplication.run( MultiDatabaseApplication.class, args );

        //ApplicationContext applicationContext = SpringApplication.run( MultiDatabaseApplication.class, args );

        //for( String name : applicationContext.getBeanDefinitionNames() ) {
        //    log.debug( "ApplicationContext Beans Names :: {}", name );
        //}
    }

    @Override
    public void run( String... args ) throws Exception {
        log.info( "result -> {}", postUserService.selectUserById( 1 ) );
        log.info( "result -> {}", myUserService.selectUserById( 1 ) );
    }
}
