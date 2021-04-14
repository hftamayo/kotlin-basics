package com.tamayo.basicsalutation

//implementing for loop

class ForLoop(){
    fun showExamples(){
        for (i in 1..10){
            println(i)
        }

        for (i in 1 until 10){
            println("$i squared is ${i * i}")
        }

        for (i in 10 downTo 0){
            println("$i squared is ${i * i}")
        }

        for (i in 10 downTo 0 step 2){
            println("$i squared is ${i * i}")
        }

//create a for loop that prints out numbers from 0 to 100 divisible by 3 and 5
        for (value in 3..100 step 3){
            if(value % 5 == 0){
                println(value)
            }
        }
    }
}