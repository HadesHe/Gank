package com.hzjytech.hades.kotlinapp.data

import java.util.*

/**
 * Created by zhanghehe on 2017/7/2.
 */
class Task
constructor(val title: String, val description: String,
            val id: String = UUID.randomUUID().toString(),
            val isCompleted: Boolean = false) {
    constructor(title: String, description: String, completed: Boolean)
            : this(title, description, UUID.randomUUID().toString())

}

val titleForList:String?
  gte(){

}
