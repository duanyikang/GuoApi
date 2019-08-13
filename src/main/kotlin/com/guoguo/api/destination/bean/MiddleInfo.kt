package com.guoguo.api.destination.bean

import java.io.Serializable

data class MiddleInfo(val classifyList: List<Classify>,
                      val bestArrange: BestArrange) : Serializable {
    data class Classify(val id: String, val imageUrl: String, val title: String) : Serializable

    data class BestArrange(val imageUrl: String, val title1: String, val title2: String, val title3: String)
}

