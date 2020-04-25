//package com.example.fragmentexample
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.fragment.app.FragmentTransaction
//
//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//        val fragment1 = Fragment1()
//        fragment1.textTitle = "Hello"
//
//        val ft1: FragmentTransaction = supportFragmentManager.beginTransaction()
//        ft1.add(R.id.frame1, fragment1)
//        ft1.commitAllowingStateLoss()
//
//
//        val fragment2 = Fragment2()
//        fragment2.textTitle = "Hello"
//
//        val ft2: FragmentTransaction = supportFragmentManager.beginTransaction()
//        ft2.add(R.id.frame2, fragment2)
//        ft2.commitAllowingStateLoss()
//
//    }
//}
