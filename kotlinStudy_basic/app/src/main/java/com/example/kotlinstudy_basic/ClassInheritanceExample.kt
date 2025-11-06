package com.example.kotlinstudy_basic

fun main() {
    val korean: Korean = Korean();
    korean.singASong();
}

//kotlin의 class는 기본적으로 final -> 상속 받기 위해 open 해줘야함.
open class HumanInheritance(val name: String = "Anonymous") {
    constructor(name: String, age: Int) : this(name) {
        println("${name}'s age is $age");
    }

    init {
        println("${name} is born");
    }

    //kotlin의 기본 메서드는 final -> override 할 메서드는 open
    open fun singASong() {
        println("lalala");
    }
}

class Korean: HumanInheritance("kingsCode", 27) {
    override fun singASong() {
        super.singASong();
        println("라라라");
        println("my name is ${name}");
        //age는 보조 생성자로 생성되어 지역 변수로만 존제.
//        println("${name}'s age is $age")
    }
}
