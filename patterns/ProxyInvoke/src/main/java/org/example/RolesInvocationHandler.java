package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public abstract class RolesInvocationHandler { }

class NonOwner implements InvocationHandler {
    UserAccount user;

    NonOwner(UserAccount user){
        this.user=user;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methName=method.getName();
        if (methName.startsWith("set"))throw new IllegalAccessError("Запрещено менять поля других пользователей");

        return method.invoke(user, args);
    }
}

class Owner implements InvocationHandler {
    UserAccount user;

    Owner(UserAccount user){
        this.user=user;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(user, args);
    }
}