package org.example;

import java.lang.reflect.Proxy;

public class UserAccount implements User{
    private String name;
    private String description;

    public UserAccount(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String setName(String newName) {
        return this.name=newName;
    }

    @Override
    public boolean setDescription(String description) {
       this.description=description;
       return true;
    }

    public User getOwnerProxy(){
        return (User) Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                this.getClass().getInterfaces(),
                new Owner(this));
    }
    public User getNonOwnerProxy(){
        return (User) Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                this.getClass().getInterfaces(),
                new NonOwner(this));
    }
}
