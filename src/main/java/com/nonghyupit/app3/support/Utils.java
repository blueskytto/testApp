package com.nonghyupit.app3.support;

import lombok.extern.slf4j.Slf4j;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Slf4j
public class Utils {

    public static SimpleDateFormat dateLongFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String getHostName(){
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getTimeStamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return dateLongFormat.format(timestamp);
    }

}
