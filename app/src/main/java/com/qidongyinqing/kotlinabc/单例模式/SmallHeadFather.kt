package com.example.pony.kotlintoutor.单例模式

import com.example.pony.kotlintoutor.委托和代理.IWashDisk

class SmallHeadFather: IWashDisk by BigHeadSon{
    override fun washing() {
        BigHeadSon.washing()
    }

}