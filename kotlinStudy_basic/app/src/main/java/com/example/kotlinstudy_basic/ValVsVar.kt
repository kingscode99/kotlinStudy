package com.example.kotlinstudy_basic

//val vs var
//val = value 바뀌지 않는 값
//var = variable 바뀔수 있는 값
fun valVarExample() {
    val a: Int = 10
    var b: Int = 9
    //a = 100    a의 값을 제정의 불가

    //b는 가능
    b = 100

    //타입 생략 가능
    val c = 100
    var d = 100
    var name = "kingsCode"

    //변수 선언시 초기화를 해주지 않는다면 타입을 지정해야 한다.
    val e: String
    //val e     불가
    var f: Float
    //var f     불가
}
