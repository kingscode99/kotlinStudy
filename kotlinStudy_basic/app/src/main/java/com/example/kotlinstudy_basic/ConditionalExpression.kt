package com.example.kotlinstudy_basic

fun main() {
    println(maxBy(1, 3))
    println(maxBy2(3, 1))
    println(maxBy3(5, 10))
    checkNum(2)
}

//java와 동일한 조건문 if
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

//kotlin에서 3항 연산자가 없기때문에 '=' 을 사용하여 함수를 지정함
fun maxBy2(a: Int, b: Int): Int = if (a > b) a else b

//함수를 따로 만들지 않고 연산식처럼 사용 가능하다.
fun maxBy3(a: Int, b: Int): Int {
    var c: Int
    c = if (a > b) a else b
    return c
}

//java의 switch case문과 같은 성격
fun checkNum(score: Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    //연산식 으로 쓸때 'else'가 필수로 붙어 초기화에 문제가 없도록 한다.
    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b: ${b}")

    //"in a..b ->" 의 의미는 a <= score && score <= b 의 의미를 가진다.
    when (score) {
        in 90..100 -> println("you are genius")
        in 30..90 -> println("not bad")
        else -> println("okay")
    }
}
