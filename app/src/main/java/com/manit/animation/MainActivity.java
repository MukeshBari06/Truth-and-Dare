package com.manit.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    boolean A=true;

    int randNumber;
    public int generateRandomNumber(){
        Random rand =new Random();
        randNumber=rand.nextInt(1800)+700;
        return randNumber;
    }

    public void rotate(View view){
        Log.i("Info", "Fade");
        ImageView imageView1=(ImageView)findViewById(R.id.imageView1);
        if(A) {
            A=false;
            imageView1.animate().rotation(generateRandomNumber()).setDuration(2000);

        }
        else{
            A=true;
            imageView1.animate().rotation(((-1)*generateRandomNumber())).setDuration(2000);
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
