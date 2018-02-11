package com.lei.anntationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.ViewsById;

import java.util.List;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    public static final String NAME_KEY = "name_key";

    public static final String AGE_KEY = "age_key";

    @ViewById(R.id.button)//初始化控件
    Button button;

//    @ViewsById({R.id.textView3)
//    List<TextView> list;
    @ViewById //可以不指定ID，使用变量名查找控件，找不到则报空指针异常
    TextView textView2;
   @ViewById(R.id.textView3)//初始化
    TextView textView3;

    @Click(R.id.button)//添加点击事件
    public void startActivity() {
        Intent intent = new Intent(MainActivity.this,SecondActivity_.class);
        intent.putExtra(NAME_KEY,"nate");
        intent.putExtra(AGE_KEY,"18");//传递参数
        startActivity(intent);
    }

    @Click({R.id.textView2,R.id.textView3})
    public void showToast() {
        Toast.makeText(MainActivity.this, "OK!", Toast.LENGTH_SHORT).show();
    }

    @AfterViews //控件初始化之后调用
    public void setTextView() {
//        for(TextView tv:list) {
//            tv.setText("HelloWorld");
//        }
       textView2.setText("Hello");
       textView3.setText("World");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
    }
}
