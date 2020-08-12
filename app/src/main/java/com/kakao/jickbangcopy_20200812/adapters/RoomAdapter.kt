package com.kakao.jickbangcopy_20200812.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.kakao.jickbangcopy_20200812.R
import com.kakao.jickbangcopy_20200812.datas.Room

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
        var addressTxt = row.findViewById<TextView>(R.id.addressTxt)
        var descTxt = row.findViewById<TextView>(R.id.descTxt)

        var data = mList[position]

        priceTxt.text = data.price.toString()
        addressTxt.text = data.address
        descTxt.text = data.description

        return row
//        return super.getView(position, convertView, parent)
    }
}