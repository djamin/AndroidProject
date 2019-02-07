package com.example.android.bangladeshview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1,button2,button3,button4,button5,button6,button7;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button1=findViewById(R.id.buttonId1);
        button2=findViewById(R.id.buttonId2);
        button3=findViewById(R.id.buttonId3);
        button4=findViewById(R.id.buttonId4);
        button5=findViewById(R.id.buttonId5);
        button6=findViewById(R.id.buttonId6);
        button7=findViewById(R.id.buttonId7);
            //received mainactivity data //
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String value=bundle.getString("name");
        }

        //ON CLICK LISENER
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonId1){
            intent= new Intent(SecondActivity.this,ThirdActivity.class);
            intent.putExtra("button","button_one");
            startActivity(intent);
        }
        if(v.getId()==R.id.buttonId2){
            intent= new Intent(SecondActivity.this,ThirdActivity.class);
            intent.putExtra("button","button_two");
            startActivity(intent);
        }
        if(v.getId()==R.id.buttonId3){
            intent= new Intent(SecondActivity.this,ThirdActivity.class);
            intent.putExtra("button","button_three");
            startActivity(intent);
        }
        if(v.getId()==R.id.buttonId4){
            intent= new Intent(SecondActivity.this,ThirdActivity.class);
            intent.putExtra("button","button_four");
            startActivity(intent);
        }
        if(v.getId()==R.id.buttonId5){
            intent= new Intent(SecondActivity.this,ThirdActivity.class);
            intent.putExtra("button","button_five");
            startActivity(intent);
        }
        if(v.getId()==R.id.buttonId6){
            intent= new Intent(SecondActivity.this,ThirdActivity.class);
            intent.putExtra("button","button_six");
            startActivity(intent);
        }
        if(v.getId()==R.id.buttonId7){
            intent= new Intent(SecondActivity.this,ThirdActivity.class);
            intent.putExtra("button","button_seven");
            startActivity(intent);
        }



    }
}
