package com.hzjytech.hades.kotlinapp.tasks

import android.content.Context
import android.support.v4.view.ViewCompat
import android.support.v4.widget.SwipeRefreshLayout
import android.util.AttributeSet
import android.view.View

/**
 * __   __    _
 * \ \ / /_ _| |_   _ _ __
 * \ V / _` | | | | | '_ \
 * | | (_| | | |_| | | | |
 * |_|\__,_|_|\__,_|_| |_|
 * Created by Hades on 2017/6/30.
 */
class ScrollChildSwipeRefreshLayout:SwipeRefreshLayout {

    private var mScrollUpChild:View?=null;

    constructor(context:Context):super(context){

    }

    constructor(context: Context,attrs:AttributeSet):super(context,attrs){

    }

    override fun canChildScrollUp(): Boolean {
        if(mScrollUpChild!=null){
            return ViewCompat.canScrollVertically(mScrollUpChild,-1)
        }
        return super.canChildScrollUp()
    }

    fun setScrollUpChild(view:View){
        mScrollUpChild=view
    }
}