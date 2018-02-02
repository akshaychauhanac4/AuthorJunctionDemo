package com.example.akshay.authorjunctiondemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomNavigationBar extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    A fragment = A.newInstance(1);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.framlayout1,fragment)
                            .commit();
                    return true;
                case R.id.navigation_Author:
                    mTextMessage.setText(R.string.title_author);
                    B fragment1 = B.newInstance(1);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.framlayout1,fragment1)
                            .commit();
                    return true;
                case R.id.navigation_Add:
                    mTextMessage.setText(R.string.title_add);
                    C fragment2 = C.newInstance(1);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.framlayout1,fragment2)
                            .commit();
                    return true;
                case R.id.navigation_Library:
                    mTextMessage.setText(R.string.title_library);
                    return true;
                case R.id.navigation_Profile:
                    mTextMessage.setText(R.string.title_profile);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_bar);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
