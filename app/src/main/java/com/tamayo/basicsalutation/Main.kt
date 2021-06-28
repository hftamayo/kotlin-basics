package com.tamayo.basicsalutation

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>){
    val uglyTroll = Troll("ugly troll", 27, 1)
    println(uglyTroll)
    uglyTroll.takeDamage(8)
    println(uglyTroll)

    val vlad = Vampyre("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

}
