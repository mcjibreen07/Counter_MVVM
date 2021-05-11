package com.google.material.dev.jibreen.ui_model_test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.material.dev.jibreen.ui_model_test.ViewModel.myModel;

public class MainActivity extends AppCompatActivity {
    private myModel model;
    private TextView score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         score = findViewById(R.id.score);
         model = new ViewModelProvider(this).get(myModel.class);
        score.setText( String.valueOf(model.getScore()));
       //  score.setText(String.valueOf(score1));
    }

    public void update(View view) {
        model.addscore();
        score.setText(String.valueOf(model.getScore()));
        }

    public void reset(View view) {
       model.resetscore();

        score.setText(String.valueOf(model.getScore()));
    }

    public void addscore(){
        ///score1 +=1;
        //score.setText(String.valueOf(score1));

    }
    public void  resetscore(){
        //score1 = 0;
        //score.setText(String.valueOf(0));
    }


}

