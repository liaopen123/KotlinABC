package com.qidongyinqing.kotlinabc.method

fun <T>Collection<T>.printToString(
    seporator:String,
    prefix:String,
    suffix:String
):String{
    val log = kotlin.text.StringBuilder(prefix)
    for((index, item ) in this.withIndex()){
        if (index>0) {
            log.append(seporator)
        }
        log.append(item.toString())
    }
    log.append(suffix)

    return log.toString()
}