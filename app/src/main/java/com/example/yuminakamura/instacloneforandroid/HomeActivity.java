package com.example.yuminakamura.instacloneforandroid;

import android.support.design.internal.BottomNavigationItemView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import Utils.BottomNavigationHelper;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setUpBottomNavigationView();
    }

    /**
     *  bottom navigation bar set up
     */

    private void setUpBottomNavigationView(){
        Log.d(TAG, "setUpBottomNavigationViewe: setting up bottom navigation view");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx)findViewById(R.id.bottomNavViewBar);
        BottomNavigationHelper.setUpBottomNavigationView(bottomNavigationViewEx);
    }

}
