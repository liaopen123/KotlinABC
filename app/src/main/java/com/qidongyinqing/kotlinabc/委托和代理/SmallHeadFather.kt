package com.qidongyinqing.kotlinabc.委托和代理

import com.example.pony.kotlintoutor.委托和代理.BigHeadSon
import com.example.pony.kotlintoutor.委托和代理.IWashDisk

class SmallHeadFather: IWashDisk by BigHeadSon() {
    override fun washing() {
    }

}