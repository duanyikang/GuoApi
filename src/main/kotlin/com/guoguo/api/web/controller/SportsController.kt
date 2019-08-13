package com.kotlin.tutorial.web.controller

import com.kotlin.tutorial.bean.BannerBean
import com.kotlin.tutorial.util.Constant
import com.kotlin.tutorial.web.dto.HttpResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sports")
class SportsController {

    /**
     * banner
     */
    @GetMapping("/getBanner")
    fun getHeadInfo(): HttpResponse<List<BannerBean>> {
        val temp = listOf(BannerBean("0", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1566290740&di=896abc663804f59b8438d156cd1c54b4&imgtype=jpg&er=1&src=http%3A%2F%2Fi.gtimg.cn%2Fqqlive%2Fimg%2Fjpgcache%2Ffiles%2Fqqvideo%2Fhori%2Fo%2Fozgstf2hfvx2mii.jpg", "1", ""),
                BannerBean("1", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1564997524&di=85a477c6ea32578b002ea55a16d75a3f&imgtype=jpg&er=1&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20170924%2F76cdd4a28b1545d98646fee678350d74.jpeg", "1", ""),
                BannerBean("2", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565696051933&di=5ac6b057805117d40e9af66e52e8eff7&imgtype=0&src=http%3A%2F%2Fwww.ha.xinhuanet.com%2Fphoto%2Fnewsphoto%2F2018-10%2F29%2F1123625411_15407671507901n.jpg", "2", ""),
                BannerBean("3", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565696051933&di=2b29dcaf6638dfc7c0214142806737d5&imgtype=0&src=http%3A%2F%2F07.imgmini.eastday.com%2Fmobile%2F20171225%2F20171225134429_7dc70a5f3b966b611828aea6ef4350f4_21.jpeg", "2", ""),
                BannerBean("4", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1565696089602&di=1997105877d05c058499a297d774ba19&imgtype=0&src=http%3A%2F%2Fpic.962.net%2Fup%2F2015-9%2F201591211033653750.jpg", "2", ""))
        return HttpResponse(temp)
    }

    /**
     * 首页列表
     */
    @GetMapping("/getList")
    fun getSportsList(): String {
        return Constant.VIDEOLISTDATA
    }

    @GetMapping("/getVideoDetail")
    fun getVideoDetail(): String {
        return Constant.VIDEODETAILDATA
    }

}