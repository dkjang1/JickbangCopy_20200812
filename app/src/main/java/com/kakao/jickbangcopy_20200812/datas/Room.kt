package com.kakao.jickbangcopy_20200812.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

//com.kakao.jickbangcopy_20200812.datas
// STEP2.Room(Kotlin Class)멤버변수 만들기
class Room(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String
) : Serializable {

    fun getFormattedPrice(): String {
        if (this.price >= 10000) {
            val hm = this.price / 10000 //정수계산은 정수
            val thousand = this.price % 10000
            val thousandStr = NumberFormat.getNumberInstance().format(thousand)
            return "${hm}억 ${thousandStr}"
        } else {
            return NumberFormat.getNumberInstance().format(this.price)
        }
    }

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