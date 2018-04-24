package com.joy.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2018-04-16.
 */
@Configuration
@ConfigurationProperties(prefix = "com.joy.openresource")
@PropertySource(value="classpath:resources.properties")
public class Resource {
    private String name;
    private String website;
    private String language;

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getLanguage() {
        return language;
    }
}
