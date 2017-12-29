package com.wanna.android20171228ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed = (EditText) findViewById(R.id.editText);
    }
    public void clickOk(View v)
    {
        Intent it = new Intent();
        it.putExtra("myresult",ed.getText().toString());
        setResult(RESULT_OK,it);
        finish();
    }
    public void clickCancel(View v)
    {
        finish();//
    }
}
