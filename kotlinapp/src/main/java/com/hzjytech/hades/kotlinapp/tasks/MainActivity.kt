package com.hzjytech.hades.kotlinapp.tasks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.Toolbar
import com.hzjytech.hades.kotlinapp.R
import java.io.BufferedReader

class MainActivity : AppCompatActivity() {

    private var mDrawerLayout:DrawerLayout?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar=findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val ab=supportActionBar
        ab!!.setHomeAsUpIndicator(R.drawable.ic_menu);

        mDrawerLayout=findViewById(R.id.drawer_layout) as DrawerLayout





    }

}
