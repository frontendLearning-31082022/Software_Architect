package com.example.mvpvm.mvpvm;

import android.view.View;

import androidx.annotation.IdRes;

public interface IView  {
    <T extends View> T findViewById(@IdRes int id);
}
