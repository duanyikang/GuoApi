package com.guoguo.api.web.dto


class HttpResponse<T>(val code: Int, val message:String, val data:T) {

    constructor(data: T):this(200,"success",data)
}