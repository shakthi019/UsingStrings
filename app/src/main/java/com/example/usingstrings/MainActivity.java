package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMsg2 = findViewById(R.id.TvMsg2);
        txtMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle", "onCreate called");
    }
        protected void onStart() {


            super.onStart();
            Log.i("Lifecycle" ,"onStart called");

        }
        protected  void onResume(){
        super.onResume();
            Log.i("Lifecycle" ,"onResume called");

        }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle" ,"onPausecalled");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle" ,"onStop called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle" ,"onDestroy called");

    }
}
