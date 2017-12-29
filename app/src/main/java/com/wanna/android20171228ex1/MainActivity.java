package com.wanna.android20171228ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv,tv2;
    final int REQUEST_PAGE_2=123;
    final int REQUEST_PAGE_3=456;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv2 = findViewById(R.id.textView4);
        tv=findViewById(R.id.textView);
   }

    public void check(View v)
    {

        tv.setText("你好");


    }
    //切換顯示ex1.2
    public void click2(View v)
    {
        //切換ex1
        Intent it=new Intent(MainActivity.this,SecActivity.class);
        //傳值ex2
        it.putExtra("data","My Value");
        startActivity(it);//執行
    }
    //接收字串，傳值顯示ex3
    public void click3(View v)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        Intent it2=new Intent(MainActivity.this,SecActivity.class);
        it2.putExtra("data2",ed.getText().toString());
        it2.putExtra("data","My Value");
        startActivity(it2);

    }
    public void click4(View v)
    {

        Intent it=new Intent(MainActivity.this,Main2Activity.class);
        startActivityForResult(it, REQUEST_PAGE_2);
    }
    public void click5(View v)
    {

        Intent it=new Intent(MainActivity.this,Sec2Activity.class);
        startActivityForResult(it, REQUEST_PAGE_3);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==REQUEST_PAGE_2) {
            if (resultCode == RESULT_OK)//判斷回傳值是RESULT_OK才要執行
            {
                tv2.setText(data.getStringExtra("myresult"));
            }
        }
        if (requestCode==REQUEST_PAGE_3) {
            if (resultCode == RESULT_OK)//判斷回傳值是RESULT_OK才要執行
            {
                tv.setText(data.getStringExtra("myresult"));
            }
        }
    }
}
