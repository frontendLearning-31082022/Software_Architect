package com.example.mvpvm.mvpvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BaseObservable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;

import com.example.mvpvm.MainActivity;
import com.example.mvpvm.R;
import com.example.mvpvm.User;
import com.example.mvpvm.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ViewModel extends BaseObservable {

    public ObservableField<String> status = new ObservableField<>();

    public ObservableField<String> usersList=new ObservableField<>();

    public ViewModel(Model_UserList model, IView mainActivity) {

        ActivityMainBinding binding = DataBindingUtil.setContentView((AppCompatActivity)mainActivity, R.layout.activity_main);

        bindModelsUserlist(model);

        status.set("Ready");

        binding.setUserList(this);
    }

    private void convertUserList(Model_UserList model){
        List<User> list= (ArrayList) model.getUsersList().stream().collect(Collectors.toList());
        ArrayList<String> noContext=new ArrayList<>();
        list.forEach(x->noContext.add(x.name));

        usersList.set(noContext.stream().collect(Collectors.joining("\r\n")));
    }

    private void bindModelsUserlist(Model_UserList model){
        model.getUsersList().addOnListChangedCallback(new ObservableList.OnListChangedCallback<ObservableList<User>>() {
            @Override
            public void onChanged(ObservableList<User> sender) {
            }

            @Override
            public void onItemRangeChanged(ObservableList<User> sender, int positionStart, int itemCount) {

            }

            @Override
            public void onItemRangeInserted(ObservableList<User> sender, int positionStart, int itemCount) {

            }

            @Override
            public void onItemRangeMoved(ObservableList<User> sender, int fromPosition, int toPosition, int itemCount) {

            }

            @Override
            public void onItemRangeRemoved(ObservableList<User> sender, int positionStart, int itemCount) {
                convertUserList(model);
            }
        });

        convertUserList(model);
    }
}
