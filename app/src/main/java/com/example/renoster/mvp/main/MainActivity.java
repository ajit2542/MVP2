package com.example.renoster.mvp.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.renoster.mvp.R;

/*Displays the Main Screen*/

public class MainActivity extends AppCompatActivity implements MainContract.MvpViw {

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);
    }
}
