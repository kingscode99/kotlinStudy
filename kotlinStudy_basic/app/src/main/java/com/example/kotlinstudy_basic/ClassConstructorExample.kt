package com.example.kotlinstudy_basic

class HumanBase() {
    //초기화된 필드값
    val name = "kingsCode"

    //class 초기화 시 작동하는 메서드.
    init {
        println("${name} is born")
    }
}

class Human1 constructor(name: String) {
    //생성자를 이용한 필드값 초기화
    val name = name

    init {
        println("${name} is born")
    }
}

//생성자 내부에서 필드 선언
class Human2 constructor(val name: String) {
    init {
        println("${name} is born")
    }
}

//constructor 생략 가능
class Human3 (val name: String) {
    init {
        println("${name} is born")
    }
}

//필드의 기본값 설정 가능
//생성자의 파라메터를 받아오면 파라메터를 사용하여 초기화.
class Human4 (val name: String = "Anonymous") {
    init {
        println("${name} is born")
    }
}

fun main() {
    val humanBase = HumanBase()
    println("this human's name is ${humanBase.name}")

    val human1 = Human1("kingsCode1")
    println("this human's name is ${human1.name}")

    val human2 = Human2("kingsCode2")
    println("this human's name is ${human2.name}")

    val human3 = Human3("kingsCode3")
    println("this human's name is ${human3.name}")

    var human4 = Human4("kingsCode4")
    println("this human's name is ${human4.name}")

    human4 = Human4()
    println("this human's name is ${human4.name}")
}
