package com.mykrobb2020.presshere.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mykrobb2020.presshere.fragments.PrefFragment;

/**
 * Created by Mike on 9/21/2015.
 */
public class PrefActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new PrefFragment()).commit();
    }
}
