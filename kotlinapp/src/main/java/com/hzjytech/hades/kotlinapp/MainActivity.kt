package com.hzjytech.hades.kotlinapp

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val x="Hey!"
        println(x.last());
        val money=Money("USA",200);
        val money2=money.copy(amount = 100000)

        val y="HI"
        if(y is String){

        }


    }

    fun String.last():Char{
        return this[length-1]
    }

    data class Money(val current:String,val amount:Int)


}
