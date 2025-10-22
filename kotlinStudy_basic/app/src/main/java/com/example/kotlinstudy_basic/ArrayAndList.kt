package com.example.kotlinstudy_basic

fun main() {
    arrayExample()
}

//array는 사이즈가 정해진 배열
//list는 사이즈가 정해지지 않은 배열
//list에는 2가지 종류가 있음
//1.List    2.MutableList
//1. List는 읽기 전용
//2. MutableList는 읽기, 쓰기 가능

fun arrayExample() {
    val array = arrayOf(1, 2, 3) //자동 타입 추론 val array: Array<Int>
    val list = listOf(1, 2, 3) //자동 타입 추론 val list: Array<Int>

    for (i in 0 until array.size) {
        println("array의 ${i}번째값은 ${array[i]}입니다.")

    }
    for (i in 0 until list.size) {
        println("list의 ${i}번째값은 ${list[i]}입니다.")
    }

    val array2 = arrayOf(1, "b", 3.4f) //자동 타입 추론 val array2: Array<Any>
    val list2 = listOf(1, "b", 11L) //자동 타입 추론 val list2: List<Any>

    for (i in 0 until array2.size) {
        println("array2의 ${i}번째값은 ${array2[i]}입니다.")
    }
    for (i in 0 until list2.size) {
        println("list2의 ${i}번째값은 ${list2[i]}입니다.")
    }

    array[0] = 3 //array의 값 변경 가능

    for (i in 0 until array.size) {
        println("array의 ${i}번째값은 ${array[i]}입니다.")
    }

    //list[0] = 2  <- list의 값 변경 불가
    val result = list.get(0) //읽기는 가능
    println("list의 변경된 0번째 값은 ${result}입니다.")

    //MutableList의 가장 대표 arrayList
    val arrayList = arrayListOf<Int>()
    //arrayList는 값을 추가 제거 가능하다.
    arrayList.add(10)
    arrayList.add(20)
    arrayList.remove(1)
    for (i in 0 until arrayList.size) {
        println("arrayList의 크기는 ${arrayList.size}이고 ${i}번째 값은 ${arrayList[i]}입니다.")
    }
}
