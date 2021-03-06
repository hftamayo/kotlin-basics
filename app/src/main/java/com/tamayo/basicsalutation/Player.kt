package com.tamayo.basicsalutation

import android.os.Build
import androidx.annotation.RequiresApi

class Player(val name: String, var level: Int = 1) {
    var lives = 3
    var score = 0
    //leccion 38: encapsulating properties
    private val inventory = ArrayList<Loot>()

    fun show(){
        if(lives > 0){
            println("$name esta vivo")
        }
        else{
            println("$name ya no tiene vidas")
        }
    }

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
        """
    }

    fun getLoot(item: Loot){
        inventory.add(item)
        //code to save the inventory
    }

    fun dropLoot(item: Loot): Boolean {
        return if(inventory.contains(item)){
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun dropLoot(name: String): Boolean{
        println("$name will be dropped")
        return inventory.removeIf{ it.name == name}
    }

    fun showInventory(){
        println("$name's Inventory")
        for(item in inventory){
            println(item)
        }

        println(inventory.get(0))
        println("==================")
    }


}