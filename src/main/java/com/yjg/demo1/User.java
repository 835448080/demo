package com.yjg.demo1;

/**
 * Created by qin on 17-8-27.
 */
@Table(tableName = "users")
public class User {
    @Column(columnName = "cccc")
    private String name;
    @Column(columnName = "xxxx")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
