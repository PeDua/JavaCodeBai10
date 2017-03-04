package com.example.pilu1.javacodebai10;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    public LinearLayout LinearLayoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        InitLayoutbyLinear();

        setContentView(LinearLayoutRoot);
    }
    public void InitLayoutbyLinear(){

        //LinearLayoutRoot
        LinearLayoutRoot = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsRoot = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearLayoutRoot.setOrientation(LinearLayout.VERTICAL);
        LinearLayoutRoot.setLayoutParams(layoutParamsRoot);
        //trong LinearLayoutRoot sẽ có các thuộc tính của layoutparamsroot và vertical

        //LinearLayoutSecond
        LinearLayout LinearLayoutSecond = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsSecond = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayoutSecond.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayoutSecond.setLayoutParams(layoutParamsSecond);

        //ImageView
        ImageView imgView = new ImageView(this);
        imgView.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imgView.setImageResource(R.mipmap.ic_launcher);

        //TextView
        TextView txt = new TextView(this);
        LinearLayout.LayoutParams LayoutParamtxtv = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LayoutParamtxtv.gravity  = Gravity.CENTER;
        LayoutParamtxtv.setMargins(20,0,0,0);
        txt.setText("Xin chào, Trần Thị Thơm");
        txt.setTextColor(0xffffff);
        txt.setLayoutParams(LayoutParamtxtv);

        LinearLayoutSecond.addView(imgView); //imgView nằm trong LinearLayoutSecond
        LinearLayoutSecond.addView(txt);


        //Button click
        Button btnClick = new Button(this);
        //   btnClick.setId(R.id.btnClick); //xét id
        LinearLayout.LayoutParams LayoutParambtnClick = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LayoutParambtnClick.gravity  = Gravity.CENTER;
        btnClick.setPadding(10,0,0,0);
        btnClick.setText("Click để xem");
        btnClick.setLayoutParams(LayoutParambtnClick);

        //Button hihi
        Button btnHihi = new Button(this);
        LinearLayout.LayoutParams LayoutParambtnHihi = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LayoutParambtnHihi.gravity  = Gravity.CENTER;
        btnHihi.setPadding(10,0,0,0);
        btnHihi.setText("Ahihi! Đồ ngốc");
        btnHihi.setLayoutParams(LayoutParambtnHihi);

        LinearLayoutRoot.addView(LinearLayoutSecond);
        LinearLayoutRoot.addView(btnClick);
        LinearLayoutRoot.addView(btnHihi);
    }
}
