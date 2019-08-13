package com.guoguo.api.destination

import com.guoguo.api.destination.bean.BottomItemInfo
import com.guoguo.api.destination.bean.HeadInfo
import com.guoguo.api.destination.bean.MiddleInfo

interface IMddService {

    /**
     * 设置头部内容
     */
    fun setHead(local: String, temperature: Int, number: Long)

    /**
     * 获取头部内容
     */
    fun getHeadInfo(local: String): HeadInfo

    /**
     * 获取中间信息
     */
    fun getMiddleInfo(local: String): MiddleInfo

    /**
     * 获取底部分类
     */
    fun getBottomTags(local: String): List<String>

    /**
     * 通过分类获取底部详情
     */
    fun getBottomDetail(tag: String): BottomItemInfo
}