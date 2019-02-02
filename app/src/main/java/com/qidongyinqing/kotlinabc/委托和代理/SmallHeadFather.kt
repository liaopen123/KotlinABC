package com.example.pony.kotlintoutor.委托和代理

class SmallHeadFather:IWashDisk by BigHeadSon(){
    override fun washing() {
    }

}