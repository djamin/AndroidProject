package com.example.android.birsreshtho;

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
        Bundle bundle =getIntent().getExtras();
        if(bundle!=null){
            String ButtonValue=bundle.getString("button");
            showDetails(ButtonValue);
        }

    }
    void showDetails(String buttonDetails){
        if(buttonDetails.equals("button_one")){
            imageView.setImageResource(R.drawable.mohiuddin_jahnagir);
            textView.setText(R.string.details_bir_jahangir);
        }
        if(buttonDetails.equals("button_two")){
            imageView.setImageResource(R.drawable.hamidur_rahman);
            textView.setText(R.string.details_bir_hamidur);
        }
        if(buttonDetails.equals("button_three")){
            imageView.setImageResource(R.drawable.mostofa_kamal);
            textView.setText(R.string.details_bir_kamal);
        }
        if(buttonDetails.equals("button_four")){
            imageView.setImageResource(R.drawable.matiur_rahman);
            textView.setText(R.string.details_bir_matiur);
        }
        if(buttonDetails.equals("button_five")){
            imageView.setImageResource(R.drawable.mohammad_ruhul_amin);
            textView.setText(R.string.details_bir_ruhul);
        }
        if(buttonDetails.equals("button_six")){
            imageView.setImageResource(R.drawable.munshi_abdur_rauf);
            textView.setText(R.string.details_bir_rouf);
        }
        if(buttonDetails.equals("button_seven")){
            imageView.setImageResource(R.drawable.nur_mohammad_sheikh);
            textView.setText(R.string.details_bir_sheikh);
        }
    }

}
