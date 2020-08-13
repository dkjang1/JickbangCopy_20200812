package com.kakao.jickbangcopy_20200812.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

//com.kakao.jickbangcopy_20200812.datas
// STEP2.Room(Kotlin Class)멤버변수 만들기
// 생성자(가격,주소,층수,설명), Serializable(Room putExtra,getExtra)
class Room(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String
) : Serializable {

//    가격(int -> String) 만들어 반환하는 기능
    fun getFormattedPrice(): String {
//    1억이 넘을경우
        if (this.price >= 10000) {
//            억단위
            val hm = this.price / 10000 //정수계산은 정수
            val thousand = this.price % 10000
            val thousandStr = NumberFormat.getNumberInstance().format(thousand)
            return "${hm}억 ${thousandStr}"
        } else {
//            7500 -> 7,500
            return NumberFormat.getNumberInstance().format(this.price)
        }
    }

//    층수(int -> String) 만들어 반환하는 기능
    fun getFormattedFloor(): String{
        val floorStr: String
        if (this.floor >= 1) {
            floorStr = "${this.floor}층"
        } else if (this.floor < 0) {
            floorStr = "지하 ${-this.floor}층"
        } else {
            floorStr = "반지하"
        }
        return floorStr
    }

    fun getCity(): String{
        return this.address.substring(this.address.lastIndexOf(" ")+1)
    }

}