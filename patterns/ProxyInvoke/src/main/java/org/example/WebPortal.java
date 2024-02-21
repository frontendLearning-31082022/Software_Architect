package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class WebPortal {
    private User user;

    private Set<UserAccount> names=new HashSet();

    WebPortal(User loginUser){
        this.user=loginUser;

        names.add((UserAccount) this.user);
        names.add(new UserAccount("Валерий","0000"));
        names.add(new UserAccount("Петр","0000"));
    }

    String getName(String name){
        List<UserAccount> userAccount=names.stream().filter(x->x.getName().equals(name)).collect(Collectors.toList());
        if (userAccount.size()==0)return null;

        User account=getProxy(userAccount.get(0));
        return account.getName();
    }

    private User getProxy(UserAccount user){
        if (user.getName().equals(this.user.getName()))return user.getOwnerProxy();
        return user.getNonOwnerProxy();
    }

    boolean setDescription(String name,String description){
        List<UserAccount> userAccount=names.stream().filter(x->x.getName().equals(name)).collect(Collectors.toList());
        if (userAccount.size()==0)throw new NoSuchElementException("Пользователся нет в системе");

        User account=getProxy(userAccount.get(0));
        try {
            return account.setDescription(description);
        }catch (IllegalAccessError e){
            e.printStackTrace();
            return false;
        }
    }

}
