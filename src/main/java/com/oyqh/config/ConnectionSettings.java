package com.oyqh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by oyqh on 2016-12-21.
 */
@Component("connectionSettings")
@ConfigurationProperties(prefix = "conne",locations ={"classpath:/config/db.yml"} )

public class ConnectionSettings {
    private String username;

    private String password;

    private String remoteaddress;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemoteaddress() {
        return remoteaddress;
    }

    public void setRemoteaddress(String remoteaddress) {
        this.remoteaddress = remoteaddress;
    }

    @Override
    public String toString() {
        return "ConnectionSettings{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", remoteaddress='" + remoteaddress + '\'' +
                '}';
    }
}
