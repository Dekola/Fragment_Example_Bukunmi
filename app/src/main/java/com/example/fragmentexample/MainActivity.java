package com.example.fragmentexample;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment1 fragment1 = new Fragment1();
        fragment1.textTitle("Hello");

        FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
        ft1.add(R.id.frame1, fragment1);
        ft1.commitAllowingStateLoss();


        Fragment2 fragment2 = new Fragment2();
        fragment2.textTitle("Bukunmi");

        FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();;
        ft2.add(R.id.frame2, fragment2);
        ft2.commitAllowingStateLoss();
    }
}
