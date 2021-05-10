package com.google.material.dev.jibreen.ui_model_test.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class myModel extends ViewModel{
     private Integer score;

    public Integer getScore() {
      if (score == null){
          score = 0;
      }
        return score;
    }
    public  void addscore(){
        if (score == null){
            score = 0;
        }
        score +=1;
    }
    public  void resetscore(){
            score = 0;
    }


}