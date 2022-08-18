package com.example.seleniumtest;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.systemProperties().hasPath("testProfile")?
                ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                :ConfigFactory.load("application.conf");
    }

    String URL = readConfig().getString("url");
    Integer AGE = readConfig().getInt("age");
    String ADMIN_LOGIN = readConfig().getString("usersParams.admin.login");
    String DEMO_PASSWORD = readConfig().getString("usersParams.demo.password");
    Boolean IS_DEMO_ADMIN = readConfig().getBoolean("usersParams.demo.isAdmin");

    String DEMO_LOGIN = readConfig().getString("usersParams.demo.login");
    String ADMIN_PASSWORD = readConfig().getString("usersParams.admin.password");
    Boolean IS_ADMIN_ADMIN = readConfig().getBoolean("usersParams.admin.isAdmin");


}
