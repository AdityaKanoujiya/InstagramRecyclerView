package com.example.instarecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FragmentChange(HomeFragment())
    }

    fun FragmentChange(fragment: Fragment){
        var transaction : FragmentTransaction
        var manager : FragmentManager
        manager= supportFragmentManager
        transaction=manager.beginTransaction()
        transaction.replace(R.id.framehomepage,fragment)
        transaction.commit()
    }
}