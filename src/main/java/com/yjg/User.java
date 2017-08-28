package com.yjg;

/**
 * Created by qin on 17-8-26.
 */
public class User {
    private String age;
    private String name;

    public void init() {
        System.out.println("system init....");
        System.out.println(wifi.getWifiName());
        System.out.println(wifi.getWifiPassword());

    }
    public WIFI getWifi() {
        return wifi;
    }

    public void setWifi(WIFI wifi) {
        this.wifi = wifi;
    }

    private WIFI wifi;




    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
