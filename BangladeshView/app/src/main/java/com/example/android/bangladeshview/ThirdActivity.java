package com.example.android.bangladeshview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        imageView=findViewById(R.id.imageViewId);
        textView=findViewById(R.id.textViewId);
        textView.setText(Html.fromHtml(getString(R.string.Intellectual_killing)));
        Bundle bundle =getIntent().getExtras();
        if(bundle!=null){
            String ButtonValue=bundle.getString("button");
            showDetails(ButtonValue);
        }

    }


    void showDetails(String buttonDetails){
         if(buttonDetails.equals("button_one")){
             imageView.setImageResource(R.drawable.button1_image);
             textView.setText(R.string.details_Intellectual_killing);
         }
        if(buttonDetails.equals("button_two")){
            imageView.setImageResource(R.drawable.button2_image);
            textView.setText(R.string.details_The_reason);
        }
        if(buttonDetails.equals("button_three")){
            imageView.setImageResource(R.drawable.button3_image);
            textView.setText(R.string.details_Killing_plan);
        }
        if(buttonDetails.equals("button_four")){
            imageView.setImageResource(R.drawable.button4_image);
            textView.setText(R.string.details_Murder_details);
        }
        if(buttonDetails.equals("button_five")){
            imageView.setImageResource(R.drawable.button5_image);
            textView.setText(R.string.details_Individuals_involved);
        }
        if(buttonDetails.equals("button_six")){
            imageView.setImageResource(R.drawable.button6_image);
            textView.setText(R.string.details_Murder_statistics);
        }
        if(buttonDetails.equals("button_seven")){
            imageView.setImageResource(R.drawable.button7_image);
            textView.setText(R.string.details_The_list_of_killed_intellectuals);
        }
    }

}
