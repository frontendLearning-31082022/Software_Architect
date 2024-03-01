package com.example.mvpvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Button;

import com.example.mvpvm.databinding.ActivityMainBinding;
import com.example.mvpvm.mvpvm.IView;
import com.example.mvpvm.mvpvm.Presenter;

public class MainActivity extends AppCompatActivity implements IView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Presenter presenter=new Presenter(this);
    }
}