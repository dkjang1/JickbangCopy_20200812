package com.kakao.jickbangcopy_20200812.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.kakao.jickbangcopy_20200812.R
import com.kakao.jickbangcopy_20200812.datas.Room
import java.text.NumberFormat
import java.util.*

// STEP4.Adapter(Kotlin Class)멤버변수 만들기
class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: List<Room>
) : ArrayAdapter<Room>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var nullCheckConvertView = convertView
        if (nullCheckConvertView == null) nullCheckConvertView =
            inf.inflate(R.layout.room_list_item, null)

        val row = nullCheckConvertView!!

//        STEP7.데이터 적용
        var priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        var addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        var descTxt = row.findViewById<TextView>(R.id.descTxt)

        var data = mList[position]

//        priceTxt.text = data.price.toString()
        if (data.price >= 10000) {
            val hm = data.price / 10000 //정수계산은 정수
            val thousand = data.price % 10000
            priceTxt.text = "${hm}억 ${NumberFormat.getInstance(Locale.KOREA).format(thousand)}"
        } else {
            priceTxt.text = NumberFormat.getInstance(Locale.KOREA).format(data.price)
        }

        var floorStr: String
        if (data.floor >= 1) {
            floorStr = "${data.floor}층"
        } else if (data.floor == 0) {
            floorStr = "반지하"
        } else {
            floorStr = "지하 ${-data.floor}층"
        }
        addressAndFloorTxt.text = "${data.address}, ${floorStr}"

        descTxt.text = data.description
//        var addressCity = data.address.substring(data.address.lastIndexOf(" ")+1)
//        descTxt.text = "${addressCity}, ${floorStr} 방입니다"

        return row
//        return super.getView(position, convertView, parent)
    }
}