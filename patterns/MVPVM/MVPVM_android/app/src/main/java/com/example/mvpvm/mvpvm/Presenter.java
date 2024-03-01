package com.example.mvpvm.mvpvm;

import android.view.View;
import android.widget.Button;

import com.example.mvpvm.MainActivity;
import com.example.mvpvm.R;

public class Presenter {
    private Model_UserList model;
    private ViewModel viewModel;

    public Presenter(IView mainActivity) {
        this.model = new Model_UserList();
        this.viewModel=new ViewModel(this.model,mainActivity);

        Button button = (Button) mainActivity.findViewById(R.id.buttonDelUser);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.delUser();
                someGuiBuisnessLogic();
            }
        });
    }

    private void someGuiBuisnessLogic(){}

}
