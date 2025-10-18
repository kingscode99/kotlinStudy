package com.example.kotlinstudy_basic

fun main() {
    stringTemplateExample()
}

fun stringTemplateExample() {
    //변수 지정
    val firstName = "Cheolsu"
    val lastName = "Kim"
    //변수 앞에 $붙이면 변수 인식
    println("my name is $firstName")
    //공백을 남기고 싶지 않을땐 {}로 감싸기
    println("my name is ${firstName}Kim")
    //+를 통해 연속해서 출력 가능
    println("my name is ${firstName + lastName}")
    //변수 뿐만 아니라 연산도 가능
    println("is this ture? ${1 == 0}")
    //$만 따로 출력하고 싶을때\를 앞에 붙인다.
    println("미국의 통화는 \$이다")
}
