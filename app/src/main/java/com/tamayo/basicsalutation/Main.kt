package com.tamayo.basicsalutation

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
    val RedPotion = Loot("Red Potion", LootType.POTION, 7.50)
    tim.inventory.add(RedPotion)
    tim.showInventory()
    println(tim)
}
