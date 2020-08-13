package com.kakao.jickbangcopy_20200812.datas

import java.io.Serializable

//com.kakao.jickbangcopy_20200812.datas
// STEP2.Room(Kotlin Class)멤버변수 만들기
class Room(
    val price: Int,
    val address: String,
    var floor: Int,
    val description: String
) : Serializable {
}