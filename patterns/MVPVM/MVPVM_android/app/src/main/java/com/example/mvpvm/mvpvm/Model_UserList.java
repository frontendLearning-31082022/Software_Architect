package com.example.mvpvm.mvpvm;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.example.mvpvm.User;

public class Model_UserList {

    ObservableList<User>usersList;

    Model_UserList(){
        usersList=new ObservableArrayList<>();
        this.loadFromDB();
    }

    private void loadFromDB(){
        this.usersList.add(new User("Вася",20));
        this.usersList.add(new User("Константин",30));
        this.usersList.add(new User("Георгий",40));
    }

    public ObservableList<User> getUsersList(){
        return this.usersList;
    }

    public void delUser(){
        if (usersList.size()>0)usersList.remove(0);
    }
}
