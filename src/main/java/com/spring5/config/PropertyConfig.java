package com.spring5.config;

import com.spring5.exampleBean.FakeDataSource;
import com.spring5.exampleBean.FakeJMSBroaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by nichaurasia on Friday, December/13/2019 at 1:05 AM
 */

@Configuration
public class PropertyConfig {

    @Value("${nitin.username}")
    String user;
    @Value("${nitin.pwd}")
    String password;
    @Value("${nitin.dburl}")
    String url;

    //Reading the property values from the application.yml file OR JMS.properties
    @Value("${nitin.jms.username}")
    String jms_user;
    @Value("${nitin.jms.pwd}")
    String jms_password;
    @Value("${nitin.jms.dburl}")
    String jms_url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJMSBroaker fakeJMSBroaker(){
        FakeJMSBroaker fakeJMSBroaker = new FakeJMSBroaker();
        fakeJMSBroaker.setJms_user(jms_user);
        fakeJMSBroaker.setJms_password(jms_password);
        fakeJMSBroaker.setJms_url(jms_url);

        return fakeJMSBroaker;
    }
}
