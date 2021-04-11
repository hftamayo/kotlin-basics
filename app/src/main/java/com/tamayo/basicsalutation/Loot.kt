package com.tamayo.basicsalutation

enum class LootType{
    POTION, RING, ARMOR
}

class Loot(val name: String, val type: LootType, val value: Double) {

    override fun toString(): string{
        return "$name is $type and isworth $value"
    }
}