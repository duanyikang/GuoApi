package com.guoguo.api.destination.bean

import java.io.Serializable

data class BottomItemInfo(val strategyList: List<MyStrategy>, var tag: String) : Serializable {
    data class MyStrategy(val ImageUrl: String, val titl: String, val desc: String):Serializable
}