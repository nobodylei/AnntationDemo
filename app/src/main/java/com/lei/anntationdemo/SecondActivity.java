package com.lei.anntationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewsById;

/**
 * Created by yanle on 2018/2/11.
 */

@EActivity(R.layout.second_main)
public class SecondActivity extends Activity{

    @Extra(MainActivity.NAME_KEY)
    String name;
    @Extra(MainActivity.AGE_KEY)
    String age;

    @ViewsById
    TextView nameView;
    @ViewsById
    TextView ageView;

    @AfterViews
    public void intiView(){
        nameView.setText(name);
        ageView.setText(age);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
}
