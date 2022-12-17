package com.inetbanking.Utilities;

import java.io.File;
import java.util.Locale;
import java.util.ResourceBundle;

public class ReadConfig {
   public ResourceBundle rb=null;
    public ReadConfig(){
        File file=new File("");

        ResourceBundle.clearCache();
         this.rb=ResourceBundle.getBundle("configuration.config");
    }
    public String getApplicationUrl(){
        String baseURL=rb.getString("baseURL");
        return baseURL;
    }
    public String getUsername(){
        String username=rb.getString("username");
        return username;
    }

    public String getPassword(){
        String password=rb.getString("password");
        return password;
    }
}
