package com.tamayo.basicsalutation

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>){
    val tim = Player("tim")
//    println(tim.name)
//    println(tim.lives)
//    println(tim.level)
//    println(tim.score)
    tim.show()

    val louise = Player("louise", 5)
    //louise.level = 5
    louise.show()

    //sesion 35: more of lists
    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    tim.getLoot(redPotion)
    //clase 37: for loops
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR,  80.00)
    tim.getLoot(chestArmor)
    tim.showInventory()
    tim.getLoot((Loot("Ring of Protection +2 ", LootType.RING, 40.25)))
    tim.getLoot((Loot("Invisibility Potion", LootType.POTION, 35.95)))
    tim.showInventory()

    if(tim.dropLoot(redPotion)){
        tim.showInventory()
    } else {
        println("you dont have a ${redPotion.name}")
    }
    val bluePotion = Loot("Blue potion", LootType.POTION, 6.00)
    if(tim.dropLoot(bluePotion)){
        tim.showInventory()
    } else {
        println("you dont have a ${bluePotion.name}")
    }

    //lesson39: example of overloading
    if(tim.dropLoot("Invisibility Potion")){
        tim.showInventory()
    }
    else{
        println("You dont have an invisibility potion")
    }





    println(tim.toString())
}
