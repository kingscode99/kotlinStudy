package com.example.kotlinstudy_basic

fun main() {
    forExample()
    whileExample()
}

fun forExample() {
    val students = arrayListOf("a", "b", "c", "d")

    //for (변수 in array)형식
    for (name in students) {
        println("학생의 이름은 \"${name}\"입니다")
    }

    //for (변수 in 정수..정수) 형식
    var sum = 0
    for (i in 1..10) {
        sum += i
    }
    println("1부터 10까지 전부 더한 값은 ${sum}입니다.")

    //for (변수 in 정수..정수 step 정수) 형식
    var sumStep2 = 0
    for (i in 1..10 step 2) {
        sumStep2 += i
    }
    println("1부터 10까지 2칸씩 띄워서 더한 값은 ${sumStep2}입니다.")

    //for (변수 in 정수 downTo 정수) 형식
    var sumDownTo2 = 0
    for (i in 10 downTo 1) {
        sumDownTo2 += i
    }
    println("10부터 1까지 2칸씩 내려가며 더한 값은 ${sumDownTo2}입니다.")

    //for (변수 in 정수 until 정수) 형식
    var sumUntil = 0
    for (i in 1 until 100) {
        sumUntil += i
    }
    println("1부터 100바로 직전 99까지 더한 값은 ${sumUntil}입니다. ")

    //for ((변수1, 변수2) in array.withIndex()) 형식
    //변수1은 Int 타입, 변수2는 array의 타입을 따라간다.
    for ((index, name) in students.withIndex()) {
//for ((index: Int, name: String) in students.withIndex()){ <- 자동타입추론
        println("${index+1}번째 학생은 ${name}입니다.")
    }

    //java의 향상된 for문은 index를 얻기위해 변수를 for문 밖에 생성해야 하기 때문에
    //생성된 index의 값이 {}가 종료되기 전까지 남아있다는 단점이 있고 그렇기 때문에 단순 index가 필요한
    //for문에서는 단순 for문을 사용해 왔는데 kotlin에서 이런 단점을 보안한점이 인상깊다.
}

fun whileExample() {
    //while (조건문)
    var index = 0
    while (index < 10) {
        println("현재 index의 값은 ${index}입니다.")
        index++
    }
}
