package com.androidbelieve.drawerwithswipetabs.navigationbar;

/**
 * Created by galan on 28/03/2017.
 */

public class UserData {
    private String nim;
    private String name;
    private String email;
    private String password;

    public UserData(String nim, String name, String email, String password){
        this.nim=nim;
        this.name=name;
        this.email=email;
        this.password=password;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
