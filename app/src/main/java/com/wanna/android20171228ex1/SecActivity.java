package com.wanna.android20171228ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        //切換顯示ex2
        TextView tv2=findViewById(R.id.textView4);
        Intent it = getIntent();
        String str=it.getStringExtra("data");
        tv2.setText(str);
        //傳值接收顯示ex3
        TextView tv3=findViewById(R.id.textView5);
        Intent it2 = getIntent();
        String str2=it2.getStringExtra("data2");
        tv3.setText(str2);


    }
}
