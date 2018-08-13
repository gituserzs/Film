package com.zs.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class jdbcUtil {
    private static String jdbcDriver="";
    private static String jdbcUrl="";
    private static String jdbcUser="";
    private static String jdbcPassword="";
    static{
        InputStream in=jdbcUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties pt= new Properties();
        try{
            pt.load(in);
            jdbcDriver=pt.getProperty("jdbc.driver");
            jdbcUrl=pt.getProperty("jdbc.url");
            jdbcUser=pt.getProperty("jdbc.username");
            jdbcPassword=pt.getProperty("jdbc.password");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(jdbcDriver);
            con = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
