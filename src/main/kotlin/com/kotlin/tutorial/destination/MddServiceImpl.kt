package com.kotlin.tutorial.destination

import com.kotlin.tutorial.destination.bean.BottomItemInfo
import com.kotlin.tutorial.destination.bean.HeadInfo
import com.kotlin.tutorial.destination.bean.MiddleInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service

/**
 * 获取目的地
 */
@Service
class MddServiceImpl : IMddService {

    @Autowired
    lateinit var redisTemplate: RedisTemplate<Any, Any>

    override fun setHead(local: String, temperature: Int, number: Long) {
        redisTemplate.opsForValue().set("mdd_head_${local}", HeadInfo(local, temperature, number))
    }

    override fun getHeadInfo(local: String): HeadInfo {
        var head = redisTemplate.opsForValue().get("mdd_head_${local}")

        if (head == null) {

            head = HeadInfo("北京", 26, 12303873454)
        }

        return head as HeadInfo
    }

    override fun getMiddleInfo(local: String): MiddleInfo {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBottomTags(local: String): List<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBottomDetail(tag: String): BottomItemInfo {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}