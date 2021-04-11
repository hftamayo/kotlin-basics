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
    //clase 37: for loops
    val chestArmor = Loot(name: "+3 Chest Armor", LootType.ARMOR, value: 80.00)
    tim.inventory.add(chestArmor)
    tim.showInventory()
    tim.inventory.add(Loot(name: "Ring of Protection +2 ", LootType.RING, value: 40.25))
    tim.inventort.add(Loot("Invisibility Potion", LootType.POTION, 35.95))
    tim.showInventory()
    println(tim.toString())
}
