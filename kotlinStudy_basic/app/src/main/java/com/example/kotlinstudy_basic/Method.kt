package com.example.kotlinstudy_basic

fun main() {
    helloWorld()
    helloWorldUnit()
    println(sum(4, 7))
}

//함수
//fun + 메서드 이름 + 파라메터 + : + 리턴타입 + 실행문 순
//실행문 내에서 세미콜론(;) 생략이 가능한듯?
fun helloWorld() {
    println("helloWorld")
}

//Unit(java에서 void역할) 생략가능
fun helloWorldUnit(): Unit {
    println("helloWorld")
}

//파라메터에서 타입은 변수 : 뒤에 위치한다.
//타입 대문자 주의 (변수형이 아니라 클레스를 사용하는지 아니면 Int 자체가 변수형인지는 아직 잘 모르겠음)
fun sum(a: Int, b: Int): Int {
    return a + b
}
