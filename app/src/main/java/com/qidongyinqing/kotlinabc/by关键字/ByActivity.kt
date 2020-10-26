package com.qidongyinqing.kotlinabc.by关键字

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qidongyinqing.kotlinabc.R
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class ByActivity : AppCompatActivity(),AnkoLogger{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_by)

       var impl =  ApiImpl(object:Api{
            override fun eat() {
                info { "吃吃吃" }
            }

            override fun play() {
                info { "玩玩玩" }
            }

        })

        impl.eat()
        impl.play()
    }
}