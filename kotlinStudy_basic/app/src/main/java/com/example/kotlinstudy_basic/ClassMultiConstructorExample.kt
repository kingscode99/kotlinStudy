package com.example.kotlinstudy_basic

//class의 형태를 집중적으로 보자.
class HumanMultiConstructor1(val name: String = "anonymous") {
    constructor(name: String, age: Int) : this(name) {
        println("human's name is ${name}, age is ${age}")
    }

    init {
        println("${name} is born")
    }
}

class HumanMultiConstructor2 {
    constructor() {
        val name = "anonymous"
        println("human's name is ${name}")
    }

    constructor(name: String) {
        println("human's name is ${name}")
    }

    constructor(name: String, hometown: String) {
        println("${name}'s hometown is ${hometown}")
    }

    constructor(name: String, age: Int) {
        println("human's name is ${name}, age is ${age}")
    }
}

fun main() {
    var human = HumanMultiConstructor1()
    human = HumanMultiConstructor1("kingsCode")
    human = HumanMultiConstructor1("kingsCode", 27)

    var human2 = HumanMultiConstructor2()
    human2 = HumanMultiConstructor2("kingsCode")
    human2 = HumanMultiConstructor2("kingscode", 27)
    human2 = HumanMultiConstructor2("kingsCode", "seoul")
}
