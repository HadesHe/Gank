package com.hzjytech.hades.kotlinapp.tasks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.Toolbar
import android.view.MenuItem
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

        mDrawerLayout!!.setStatusBarBackground(R.color.colorPrimaryDark);

        val navigationView=findViewById(R.id.nav_view) as NavigationView;
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }

        var tasksFragment:TaskFragment?=supportFragmentManager.findFragmentById(R.id.contentFrame) as? TasksFragment
        if(taskFragment==null){
            taskFragment=TaskFragment.newInstance()
            ActivityUtils.addFragmentToActivity(supportFragmentManager
            ,tasksFragment!!,R.id.contentFrame)
        }





    }

    private fun setupDrawerContent(navigationView: NavigationView) {
        navigationView.setNavigationItemSelectedListener { menuItem: MenuItem ->
            when(menuItem.itemId){
                R.id.list_navigation_menu_item -> {

                }
                R.id.statistics_navigation_menu_item -> {

                }
                else -> {

                }

            }
            menuItem.isChecked=true
            mDrawerLayout!!.closeDrawers()

            true
        }
    }

}
