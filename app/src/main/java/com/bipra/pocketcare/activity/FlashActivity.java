package com.bipra.pocketcare.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bipra.pocketcare.R;

/**
 * Created by bipraroy on 07/01/17.
 */

public class FlashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(FlashActivity.this,DashboardActivity.class));
            }
        },2000);
    }
}
