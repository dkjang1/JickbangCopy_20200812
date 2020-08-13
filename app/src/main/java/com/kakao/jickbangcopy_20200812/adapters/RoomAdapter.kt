package com.kakao.jickbangcopy_20200812.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.kakao.jickbangcopy_20200812.R
import com.kakao.jickbangcopy_20200812.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import java.text.NumberFormat
import java.util.*

// STEP4.Adapter(Kotlin Class)멤버변수 만들기
class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: List<Room>
) : ArrayAdapter<Room>(mContext, resId, mList) {

//    재사용성에서고려해서(메모리등록-객체화) 실행주는 주체
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        null체크확인
        var nullCheckConvertView = convertView
        if (nullCheckConvertView == null) nullCheckConvertView =
            inf.inflate(R.layout.room_list_item, null)
//        재사용성을 고려해서 모든 확인이 끝난상황에서 row 대입
        val row = nullCheckConvertView!!

//        STEP7.데이터 적용
        var priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        var addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        var descTxt = row.findViewById<TextView>(R.id.descTxt)

//        화면에 뿌려질 근거데이터 / 기능을 갖고있는 변수를 상황에 맞게 가져오자
        var data = mList[position]

//        실제 데이터를 화면에 반영
//        priceTxt.text = data.price.toString()
//        if (data.price >= 10000) {
//            val hm = data.price / 10000 //정수계산은 정수
//            val thousand = data.price % 10000
//            priceTxt.text = "${hm}억 ${NumberFormat.getInstance(Locale.KOREA).format(thousand)}"
//        } else {
//            priceTxt.text = NumberFormat.getInstance(Locale.KOREA).format(data.price)
//        }
        priceTxt.text = data.getFormattedPrice()

//        var floorStr: String
//        if (data.floor >= 1) {
//            floorStr = "${data.floor}층"
//        } else if (data.floor == 0) {
//            floorStr = "반지하"
//        } else {
//            floorStr = "지하 ${-data.floor}층"
//        }
//        addressAndFloorTxt.text = "${data.address}, ${floorStr}"
        addressAndFloorTxt.text = "${data.address}, ${data.getFormattedFloor()}"

//        descTxt.text = data.description
        descTxt.text = "${data.getCity()} ${data.getFormattedFloor()} 방입니다"

        return row
//        return super.getView(position, convertView, parent)
    }
}