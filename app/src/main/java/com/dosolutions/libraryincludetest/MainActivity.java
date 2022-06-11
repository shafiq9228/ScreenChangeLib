package com.dosolutions.libraryincludetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dosolutions.mymod1.MyToaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyToaster toaster = new MyToaster();
        toaster.DisplayToast(MainActivity.this, "jdsf");


    }
}