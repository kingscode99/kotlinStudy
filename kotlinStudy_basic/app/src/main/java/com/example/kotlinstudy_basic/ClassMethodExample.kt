package com.example.kotlinstudy_basic

class Human() {
    //파라메터가 없는 메서드
    fun born() {
        println("new human is born")
    }

    //파라메터가 있는 메서드
    fun born(name: String) {
        println("${name} is born")
    }
}

fun main() {
    val human = Human()
    human.born()

    human.born("kingsCode")
}
