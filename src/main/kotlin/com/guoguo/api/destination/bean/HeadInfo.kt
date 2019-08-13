package com.kotlin.tutorial.destination.bean

import java.io.Serializable

/**
 * 目的地头部信息
 */
data class HeadInfo(var local:String,var temperature:Int,var number:Long):Serializable