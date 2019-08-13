package com.kotlin.tutorial.web.controller

import com.kotlin.tutorial.destination.bean.HeadInfo
import com.kotlin.tutorial.destination.IMddService
import com.kotlin.tutorial.destination.bean.BottomItemInfo
import com.kotlin.tutorial.destination.bean.MiddleInfo
import com.kotlin.tutorial.web.dto.HttpResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mdd")
class DestinationController {

    @Autowired
    lateinit var mddService: IMddService

    @GetMapping("/getMddHeadInfo")
    fun getHeadInfo(@RequestParam("local") local: String): HttpResponse<HeadInfo> {
        return HttpResponse(mddService.getHeadInfo(local))
    }

    @GetMapping("/setMddHeadInfo")
    fun setHeadInfo(@RequestParam("local") local: String, @RequestParam("temperature") temperature: Int, @RequestParam("number") number: Long) {
        mddService.setHead(local, temperature, number)
    }

    @GetMapping("/getMddMiddleInfo")
    fun getMiddleInfo(@RequestParam("local") local: String):HttpResponse<MiddleInfo>{
        return HttpResponse(mddService.getMiddleInfo(local))
    }

    @GetMapping("/getMddBottomTags")
    fun getBottomTags(@RequestParam("local") local: String):HttpResponse<List<String>>{
        return HttpResponse(listOf("综合","最新","网红打卡","京郊游","老北京名吃","还有就不知道了"))
    }

    @GetMapping("/getMddBottomItem")
    fun getBottomItems(@RequestParam("tag") tag: String):HttpResponse<BottomItemInfo>{
        return HttpResponse(mddService.getBottomDetail(tag))
    }
}