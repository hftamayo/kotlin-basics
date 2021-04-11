package com.tamayo.basicsalutation

class Player(val name: String, var level: Int = 1) {
    var lives = 3
    var score = 0
    val inventory = ArrayList<Loot>()

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

    fun showInventory(){
        println("$name's Inventory")
        for(item in inventory){
            println(item)
        }

        println(inventory.get(0))
        println("==================")
    }


}