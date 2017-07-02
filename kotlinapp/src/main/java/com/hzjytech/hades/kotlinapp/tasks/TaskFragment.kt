package com.hzjytech.hades.kotlinapp.tasks

import android.os.Bundle
import android.support.v4.app.Fragment

/**
 * Created by zhanghehe on 2017/7/2.
 */
class TaskFragment:Fragment,TasksContract.TasksView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mListAdapter=TaskAdapter(ArrayList<Task>(0),mItemListener)
    }

}