package com.example.kotlinstudy_basic

import java.util.Locale

fun main() {
    nullExample()
    ignoreNulls("abc")
}

//java에서 NPE (NULL POINTER EXCEPTION)은 run time 에서만 잡을 수 있는 exception이었다
//kotlin에서는 컴파일 단계에서 빨간줄로 오류를 잡아준다.
fun nullExample() {
    var name: String = "kingsCode"
//    var name: String = null      <- 불가(nullAble 이 아님)
    var nullName: String? = null     //<- 가능 (nullAble)

    var nameInUpperCase = name.uppercase(Locale.getDefault())
    println(nameInUpperCase)

    //함수 실행시 변수가 null이면 null반환
    //java코드에서 "String nullNameInUpperCase = (nullName != null) ? nullName.toUpperCase() : null" 을 획기적으로 줄였다.
    var nullNameInUpperCase = nullName?.uppercase(Locale.getDefault())
    println(nullNameInUpperCase)

    //-------------------------------------------------------------------------------------------------------------------------
    // ?:  deport값 설정
    val lastName: String? = null
    //deport값이 "No LastName"
    val fullName = name + " " + (lastName ?: "No LastName")
    println(fullName)
    //exception처리도 가능하다.
    val exceptionLastName = lastName ?: IllegalArgumentException("No LastName")
}

//-------------------------------------------------------------------------------------------------------------------------
//!!
fun ignoreNulls(str: String?) {
    //확실하게 null이 아닐때 사용한다.
    //!!는 null이 들어오게 되면 NPE가 발생됨으로 '?:' 사용을 권장 한다.
    val notNull: String = str!!
    val notNullUpper: String = notNull.toUpperCase()
    println(notNullUpper)
}
